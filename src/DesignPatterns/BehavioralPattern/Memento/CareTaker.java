package DesignPatterns.BehavioralPattern.Memento;

import java.util.Stack;

public class CareTaker {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (history.isEmpty())
            return;
        //Remove the current state
        history.pop();

        //Restore to the previous state
        if (!history.isEmpty()) {
            editor.restore(history.peek());
        }
    }
}
