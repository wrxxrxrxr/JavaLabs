package zad3;

import java.util.List;
import java.util.Random;

public class Chak extends Thread {
    private final List<Integer> list;
    private final boolean isProducer;
    private final Object lock;
    private static final int MAX_SIZE = 10;

    public Chak(List<Integer> list, boolean isProducer, Object lock) {
        this.list = list;
        this.isProducer = isProducer;
        this.lock = lock;
    }

    private void addData() {
        Random random = new Random();
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (lock) {
                    while (list.size() >= MAX_SIZE) {
                        System.out.println("Буфер полон. Производитель ждёт...");
                        lock.wait();
                    }
                    int value = random.nextInt(100);
                    list.add(value);
                    System.out.println("Добавлено: " + value);
                    Thread.sleep(500);
                    lock.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void removeData() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (lock) {
                    while (list.isEmpty()) {
                        System.out.println("Буфер пуст. Потребитель ждёт...");
                        lock.wait();
                    }
                    int value = list.remove(0);
                    System.out.println("Удалено: " + value);
                    lock.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    public void run() {
        if (isProducer) {
            addData();

        } else {
            removeData();
        }
    }
}
