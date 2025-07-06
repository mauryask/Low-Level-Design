package DesignPatterns.BehavioralPattern.Memento;

public class Main {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        TextEditor editor = new TextEditor();
        editor.write("A");
        careTaker.saveState(editor);
        editor.write("B");
        careTaker.saveState(editor);
        editor.write("C");
        careTaker.saveState(editor);
        System.out.println(editor.getContent());
        //Undo the last change
        careTaker.undo(editor);
        System.out.println(editor.getContent());
    }
}
