package DesignPatterns.Structural.Decorator.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.2;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", Milk";
    }
}
