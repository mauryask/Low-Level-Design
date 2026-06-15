package DesignPatterns.BehavioralPattern.Interpreter;

public class SubtractExpression implements Expression {
    private final Expression left, right;

    public SubtractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}
