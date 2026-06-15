package DesignPatterns.Structural.Decorator.Coffee;

public class PlainCoffee implements Coffee {
    public PlainCoffee() {
    }

    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }
}
