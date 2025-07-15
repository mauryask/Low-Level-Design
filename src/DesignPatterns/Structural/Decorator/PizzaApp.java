package DesignPatterns.Structural.Decorator;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new CheesePizza(pizza);
        pizza = new MushroomPizza(pizza);
        pizza = new OlivePizza(pizza);
        pizza = new TomatoPizza(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
