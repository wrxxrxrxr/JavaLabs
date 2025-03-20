import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosophers {
    public static void main(String[] args) throws InterruptedException {
        final int NUM_PHILOSOPHERS = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_PHILOSOPHERS);
        Lock[] forks = new ReentrantLock[NUM_PHILOSOPHERS];
        Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new ReentrantLock();
        }

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            Lock leftFork = forks[i];
            Lock rightFork = forks[(i + 1) % NUM_PHILOSOPHERS];
            philosophers[i] = new Philosopher(i, leftFork, rightFork);
            executorService.execute(philosophers[i]);
        }

        Thread.sleep(50000);
        executorService.shutdownNow();
        executorService.awaitTermination(1, TimeUnit.SECONDS);

        for (Philosopher philosopher : philosophers) {
            System.out.println("Философ " + philosopher.getId() + " ел " + philosopher.getEatingCount() + " раз.");
        }

        System.out.println("Программа завершена.");
    }
}