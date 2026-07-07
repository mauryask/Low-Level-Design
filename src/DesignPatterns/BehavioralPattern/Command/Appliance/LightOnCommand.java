package DesignPatterns.BehavioralPattern.Command.Appliance;

public class LightOnCommand extends Command {
    public LightOnCommand(Appliance appliance) {
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