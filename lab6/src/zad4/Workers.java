package zad4;

public abstract class Workers {
    public String name;

    public Workers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println(name);
    }

    public abstract double calculate();
}
