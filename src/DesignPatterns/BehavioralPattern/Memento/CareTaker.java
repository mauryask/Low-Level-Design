package DesignPatterns.BehavioralPattern.Memento;

import java.util.Stack;

public class CareTaker {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            history.pop();
            editor.restore(history.peek());
        }
    }
}
