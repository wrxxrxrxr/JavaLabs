package zad1;

public class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "цена = " + price;
    }
}
