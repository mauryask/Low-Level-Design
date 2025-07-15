package DesignPatterns.Structural.Decorator;

public class TomatoPizza extends PizzaDecorator {
    public TomatoPizza(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Tomato";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 12.0;
    }
}
