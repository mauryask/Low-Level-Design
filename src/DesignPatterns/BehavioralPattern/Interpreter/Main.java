package DesignPatterns.BehavioralPattern.Interpreter;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Expression: (x:5 + y:8) - (a:3 + b:4) * c:12
        Map<String, Integer> map = Map.of("x", 5, "y", 8, "a", 3, "b", 4, "c", 12);
        Context context = new Context(map);

        Expression expression = new SubtractExpression(new AddExpression(new VariableExpression("x"), new VariableExpression("y")),
                new MultiplyExpression(new AddExpression(new VariableExpression("a"), new VariableExpression("b")), new VariableExpression("c")));

        System.out.println("Expression result:: " + expression.interpret(context));
    }
}
