package DesignPatterns.BehavioralPattern.Interpreter;

import java.util.Map;

public class Context {
    private final Map<String, Integer> map;

    public Context(Map<String, Integer> map) {
        this.map = map;
    }

    public int lookup(String variable) {
        if (!map.containsKey(variable)) throw new IllegalArgumentException("Unsupported variable!!");
        return map.get(variable);
    }
}
