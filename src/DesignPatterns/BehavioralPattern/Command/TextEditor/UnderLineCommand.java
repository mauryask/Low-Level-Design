package DesignPatterns.BehavioralPattern.Command.TextEditor;

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