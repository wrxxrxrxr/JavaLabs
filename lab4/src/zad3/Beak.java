package zad3;

public class Beak {
    private String shape;

    public Beak(String shape) {
        this.shape = shape;
    }

    public String peck() {
        return "Клюв клюёт!";
    }

    public String getShape() {
        return shape;
    }
}
