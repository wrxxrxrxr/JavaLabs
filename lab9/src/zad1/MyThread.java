package zad1;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Состояние во время выполнения: " + getState());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван.");
        }
    }
}