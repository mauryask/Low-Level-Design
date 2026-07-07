package DesignPatterns.BehavioralPattern.Command.Appliance;

public class SpeakerOnCommand extends Command {
    public SpeakerOnCommand(Appliance appliance) {
        super(appliance);
    }

    @Override
    public void execute() {
        appliance.turnOn();
    }

    @Override
    public void undo() {
        appliance.turnOff();
    }
}
