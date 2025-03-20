package zad3;

public class Bird implements BirdInt {
    private String name;
    private Wings wings;
    private Beak beak;

    public Bird(String name, int wingSpan, String beakShape) {
        this.name = name;
        this.wings = new Wings(wingSpan);
        this.beak = new Beak(beakShape);
    }

    @Override
    public String fly() {
        return name + " летает";
    }

    @Override
    public String land() {
        return name + " приземляется на землю";
    }

    @Override
    public String feed() {
        return name + " кормит";
    }

    @Override
    public String attack() {
        return name + " атакует";
    }

    public Wings getWings() {
        return wings;
    }

    public Beak getBeak() {
        return beak;
    }
}
