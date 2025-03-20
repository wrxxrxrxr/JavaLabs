package zad2;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Поток 1");
        MyThread thread2 = new MyThread("Поток 2");

        thread1.start();
        thread2.start();
    }
}