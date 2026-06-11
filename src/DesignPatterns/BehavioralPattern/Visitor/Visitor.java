package DesignPatterns.BehavioralPattern.Visitor;

public interface Visitor {
    void visitCircle(Circle circle);

    void visitRectangle(Rectangle rectangle);

    void visitTriangle(Triangle triangle);
}
