package DesignPatterns.BehavioralPattern.Interpreter;

public class MultiplyExpression implements Expression{
    private final Expression left, right;

    public MultiplyExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}
