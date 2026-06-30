package DesignPatterns.Structural.Bridge.BadCode;

public class BlueCircle extends Circle{
    public BlueCircle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
