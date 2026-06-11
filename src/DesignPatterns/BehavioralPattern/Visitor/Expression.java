package DesignPatterns.BehavioralPattern.Visitor;

public interface Expression {
    void accept(Visitor visitor);
}
