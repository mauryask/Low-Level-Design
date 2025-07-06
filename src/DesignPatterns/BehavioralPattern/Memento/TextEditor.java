package DesignPatterns.BehavioralPattern.Memento;

public class TextEditor {
    private String content;

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
        this.content = memento.getContent();
    }
}
