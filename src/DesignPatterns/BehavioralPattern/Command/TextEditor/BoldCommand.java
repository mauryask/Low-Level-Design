package DesignPatterns.BehavioralPattern.Command.TextEditor;

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
