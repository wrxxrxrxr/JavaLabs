package zad3;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Pet> pets = new HashMap<>();

        pets.put("Бублик", new Cat("Бублик"));
        pets.put("Ральф", new Dog("Ральф"));
        pets.put("Кеша", new Parrot("Кеша"));

        printKeys(pets);
    }

    public static void printKeys(HashMap<String, Pet> pets) {
        System.out.println("Ключи в отображении:");
        for (Pet value : pets.values()) {
            System.out.println(value);
        }
    }
}
