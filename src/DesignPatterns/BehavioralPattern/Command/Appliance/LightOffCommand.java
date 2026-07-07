package DesignPatterns.BehavioralPattern.Command.Appliance;

public class LightOffCommand extends Command {
    public LightOffCommand(Appliance appliance) {
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
