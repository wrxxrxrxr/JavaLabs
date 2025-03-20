
import java.util.concurrent.locks.Lock;
import java.util.Random;

class Philosopher implements Runnable {
    private final int id;
    private final Lock leftFork;
    private final Lock rightFork;
    private final Random random;
    private static final int MAX_EATING = 2000;
    private int eatingCount = 0;
    private static final Object eatingMonitor = new Object();

    public Philosopher(int id, Lock leftFork, Lock rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.random = new Random();
    }

    public int getId() {
        return id;
    }

    public int getEatingCount() {
        return eatingCount;
    }

    private void think() throws InterruptedException {
        System.out.println("Философ " + id + " размышляет.");
        Thread.sleep(random.nextInt(100));
    }

    private void eat() throws InterruptedException {
        System.out.println("Философ " + id + " ест.");
        Thread.sleep(random.nextInt(100));
        eatingCount++;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                think();

                synchronized (eatingMonitor) {
                    while (eatingCount >= MAX_EATING) {
                        eatingMonitor.wait();
                    }
                    eatingCount++;
                }

                leftFork.lock();
                try {
                    if (rightFork.tryLock()) {
                        try {
                            eat();
                        } finally {
                            rightFork.unlock();
                        }
                    }
                } finally {
                    leftFork.unlock();
                }

                synchronized (eatingMonitor) {
                    eatingCount--;
                    eatingMonitor.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}