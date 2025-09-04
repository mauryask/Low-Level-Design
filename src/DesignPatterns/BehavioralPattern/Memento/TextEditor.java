package DesignPatterns.BehavioralPattern.Memento;

//Originator: whose state needs to be saved and restored
//It creates a memento containing its current state, and can accept a memento to restore its state
public class TextEditor {
    private String content;

    public TextEditor(String content) {
        this.content = content;
    }

    //Write into text editor (Kind of setter)
    public void write(String content) {
        this.content = content;
    }

    //Get content editor content (Kind of getter)
    public String getContent() {
        return content;
    }

    //Save this state into a memento
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    //Restore this state from memento
    public void restore(EditorMemento memento) {
        if (memento != null) {
            this.content = memento.getContent();
        }
    }
}
