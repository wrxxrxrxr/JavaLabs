package zad1;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        System.out.println("Состояние перед запуском: " + thread.getState());

        thread.start();
        System.out.println("Состояние после запуска: " + thread.getState());

        try {
            Thread.sleep(100);
            System.out.println("Состояние после небольшой задержки: " + thread.getState());

            thread.join();
        } catch (InterruptedException e) {}

        System.out.println("Состояние после завершения: " + thread.getState());
    }
}