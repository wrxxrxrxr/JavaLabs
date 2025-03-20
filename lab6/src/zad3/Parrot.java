package zad3;

public class Parrot extends Pet {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Попугай: " + name;
    }
}