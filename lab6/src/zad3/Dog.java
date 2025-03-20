package zad3;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Собака: " + name;
    }
}