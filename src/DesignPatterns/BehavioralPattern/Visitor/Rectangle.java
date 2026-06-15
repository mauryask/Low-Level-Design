package DesignPatterns.BehavioralPattern.Visitor;

public record Rectangle(int height, int width) implements Shape {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }
}
