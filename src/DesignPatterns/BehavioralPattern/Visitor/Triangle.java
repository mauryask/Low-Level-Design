package DesignPatterns.BehavioralPattern.Visitor;

public record Triangle(int base, int length) implements Shape{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitTriangle(this);
    }
}
