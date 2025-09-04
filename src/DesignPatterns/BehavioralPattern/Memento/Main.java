package DesignPatterns.BehavioralPattern.Memento;

public class Main {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        TextEditor editor = new TextEditor("");
        //Save default state of the editor
        careTaker.saveState(editor);

        editor.write("A");
        careTaker.saveState(editor);

        editor.write("B");
        careTaker.saveState(editor);

        editor.write("C");
        careTaker.saveState(editor);
        //Printing the current state
        System.out.println(editor.getContent());

        //Undo-01
        careTaker.undo(editor);
        System.out.println(editor.getContent());

        //Undo-02
        careTaker.undo(editor);
        System.out.println(editor.getContent());

        //Undo-03
        careTaker.undo(editor);
        System.out.println(editor.getContent());
    }
}
