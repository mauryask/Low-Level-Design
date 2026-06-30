package DesignPatterns.Structural.Bridge.GoodCode;

public class Square implements Shape{
    private final double side;
    private final Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void area() {
        System.out.printf("Area of %s square %s%n", color.getColor(), side * side);
    }
}
