package DesignPatterns.Structural.Decorator;

public class OlivePizza extends PizzaDecorator {
    public OlivePizza(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Olive";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 23.0;
    }
}
