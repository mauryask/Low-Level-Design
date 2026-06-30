package DesignPatterns.Structural.Bridge.GoodCode;

public class Main {
    public static void main(String[] args) {
        // Refer: https://refactoring.guru/design-patterns/bridge/java/example
        Color red = new Red();
        Color blue = new Blue();
        Shape circle = new Circle(12.9, red);
        Shape square = new Square(4, blue);
        circle.area();
        square.area();
    }
}
