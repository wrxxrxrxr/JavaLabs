package zad2;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Поток: " + getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}
