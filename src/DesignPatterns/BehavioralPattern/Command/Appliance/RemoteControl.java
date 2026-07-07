package DesignPatterns.BehavioralPattern.Command.Appliance;

// Invoker
public class RemoteControl {
    private Command command;
    private Command history;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void clickButton() {
        command.execute();
        history = command;
    }

    public void clickUndo() {
        if (history != null) history.undo();
    }
}
