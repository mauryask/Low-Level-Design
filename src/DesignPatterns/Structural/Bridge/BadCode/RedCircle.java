package DesignPatterns.Structural.Bridge.BadCode;

public class RedCircle extends Circle {
    public RedCircle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
