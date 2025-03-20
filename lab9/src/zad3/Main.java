package zad3;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Object lock = new Object();

        Chak producer = new Chak(list, true, lock);
        Chak consumer = new Chak(list, false, lock);

        producer.start();
        consumer.start();
    }
}
