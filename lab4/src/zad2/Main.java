package zad2;

public class Main {
    public static void main(String[] args) {
        Workers worker = new WorkerFix(15000.0, "Artyom");
        System.out.println(worker.calculate());
        worker.info();
        Workers worker2 = new WorkerHours(105.0, "Pasha");
        System.out.println(worker2.calculate());
        worker2.info();
    }
}