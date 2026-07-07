package DesignPatterns.BehavioralPattern.Interpreter;

// Terminal expression
public class VariableExpression implements Expression {
    private final String variable;

    public VariableExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Context context) {
        return context.lookup(variable);
    }
}
