package DesignPatterns.BehavioralPattern.Visitor;

public class AreaVisitor implements Visitor {
    private double area = 0;

    @Override
    public void visitCircle(Circle circle) {
        area = Math.PI * Math.pow(circle.radius(), 2);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        area = rectangle.height() * rectangle.width();
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        area = 0.5 * triangle.base() * triangle.length();
    }

    public double getArea() {
        return area;
    }
}
