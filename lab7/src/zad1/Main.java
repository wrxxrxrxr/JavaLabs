package zad1;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Product> toys = new HashMap<>();
        try {
            toys.put("Мишка", new Product(23.99, -10));
            toys.put("Машинка", new Product(49.99, 5));
            toys.put("Лего", new Product(29.99, 20));

            printEntrySet(toys);
            printKeySet(toys);
            printValues(toys);

        } catch (NullPointerException e) {
            System.out.println("Ошибка: Попытка работы с null");
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static void printEntrySet(HashMap<String, Product> map) {
        try {
            if (map == null) {
                throw new IllegalArgumentException("Коллекция пуста, нечего выводить.");
            }
            System.out.println("Набор из имен продуктов:");
            for (Map.Entry<String, Product> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void printKeySet(HashMap<String, Product> map) {
        try {
            if (map == null) {
                throw new IllegalArgumentException("Коллекция пуста, нечего выводить.");
            }
            System.out.println("\nКлючи:");
            for (String key : map.keySet()) {
                System.out.println(key);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void printValues(HashMap<String, Product> map) {
        try {
            if (map == null || map.isEmpty()) {
                throw new IllegalArgumentException("Коллекция пуста, нечего выводить.");
            }
            System.out.println("\nЗначения:");
            for (Product value : map.values()) {
                System.out.println(value);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}