package DesignPatterns.Structural.Bridge.GoodCode;

public class Circle implements Shape{
    private final double radius;
    private final Color color;
    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void area() {
        System.out.printf("Area of %s circle is %s%n", color.getColor(), Math.PI * radius * radius);
    }
}
