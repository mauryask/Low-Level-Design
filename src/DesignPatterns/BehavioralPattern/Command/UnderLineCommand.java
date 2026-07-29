package DesignPatterns.BehavioralPattern.Command;

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