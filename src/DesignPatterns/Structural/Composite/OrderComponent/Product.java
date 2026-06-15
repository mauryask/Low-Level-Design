package DesignPatterns.Structural.Composite.OrderComponent;

// Leaf
public class Product implements OrderComponent {
    private final double price;
    private final String name;

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
