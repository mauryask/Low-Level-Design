package DesignPatterns.Structural.Decorator;

public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getCost() {
        return 99.0;
    }
}
