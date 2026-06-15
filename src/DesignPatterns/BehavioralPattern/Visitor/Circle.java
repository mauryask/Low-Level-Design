package DesignPatterns.BehavioralPattern.Visitor;

public record Circle(double radius) implements Shape {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
