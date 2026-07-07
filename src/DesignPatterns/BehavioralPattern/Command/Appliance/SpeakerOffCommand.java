package DesignPatterns.BehavioralPattern.Command.Appliance;

public class SpeakerOffCommand extends Command{
    public SpeakerOffCommand(Appliance appliance) {
        super(appliance);
    }

    @Override
    public void execute() {
        appliance.turnOff();
    }

    @Override
    public void undo() {
        appliance.turnOn();
    }
}
