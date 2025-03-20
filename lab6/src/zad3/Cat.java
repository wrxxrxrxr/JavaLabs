package zad3;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat: " + name;
    }
}