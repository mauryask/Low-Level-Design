package DesignPatterns.BehavioralPattern.Command;

class BoldCommand implements Command {
    private final TextEditor textEditor;

    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.boldText();
    }
}

class ItalicCommand implements Command {
    private final TextEditor textEditor;

    public ItalicCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.italicText();
    }
}

class UnderlineCommand implements Command {
    private final TextEditor textEditor;

    public UnderlineCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.underlineText();
    }
}

public class TextEditor {
    public void boldText() {
        System.out.println("Making text bold..");
    }

    public void italicText() {
        System.out.println("Making text italic..");
    }

    public void underlineText() {
        System.out.println("Making text underlined..");
    }
}
