package zad1;

public class Product {
    private double price;
    private int quantity;

    public Product(double price, int quantity) {
        if (price < 0) {
            throw new IllegalArgumentException("Цена продукта не может быть отрицательной.");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Количество продукта не может быть отрицательным.");
        }
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "цена = " + price + ", количество = " + quantity;
    }
}