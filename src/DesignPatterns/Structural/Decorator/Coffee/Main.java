package DesignPatterns.Structural.Decorator.Coffee;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        System.out.printf("Cost: %s\nDescription: %s%n", coffee.getPrice(), coffee.getDescription());
        // Wrap it with mill
        coffee = new MilkDecorator(coffee);
        System.out.printf("Cost: %s\nDescription: %s%n", coffee.getPrice(), coffee.getDescription());
        // Now add some sugar
        coffee = new SugarDecorator(coffee);
        System.out.printf("Cost: %s\nDescription: %s%n", coffee.getPrice(), coffee.getDescription());
    }
}
