package DesignPatterns.Structural.Decorator.Coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
