package DesignPatterns.Structural.Decorator;

public class CheesePizza extends PizzaDecorator {
    public CheesePizza(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 20.0;
    }

}
