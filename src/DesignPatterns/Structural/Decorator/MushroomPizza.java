package DesignPatterns.Structural.Decorator;

public class MushroomPizza extends PizzaDecorator{
    public MushroomPizza(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 18.0;
    }
}
