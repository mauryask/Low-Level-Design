package DesignPatterns.BehavioralPattern.Command.TextEditor;

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
