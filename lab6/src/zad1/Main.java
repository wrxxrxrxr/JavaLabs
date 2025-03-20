package zad1;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Product> toys = new HashMap<>();
        toys.put("Мишка", new Product(19.99));
        toys.put("Машинка", new Product(49.99));
        toys.put("Лего", new Product(29.99));

        printEntrySet(toys);

        printKeySet(toys);

        printValues(toys);
    }

    public static void printEntrySet(HashMap<String, Product> map) {
        System.out.println("Набор из имен продуктов:");
        for (Map.Entry<String, Product> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void printKeySet(HashMap<String, Product> map) {
        System.out.println("\nКлючи:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

    public static void printValues(HashMap<String, Product> map) {
        System.out.println("\nЗначения:");
        for (Product value : map.values()) {
            System.out.println(value);
        }
    }
}