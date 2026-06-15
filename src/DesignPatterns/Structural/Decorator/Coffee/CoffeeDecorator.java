package DesignPatterns.Structural.Decorator.Coffee;

public class CoffeeDecorator extends PlainCoffee {
    private final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
