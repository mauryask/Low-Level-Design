package DesignPatterns.BehavioralPattern.Command.Appliance;

public abstract class Command {
    protected final Appliance appliance;

    public Command(Appliance appliance) {
        this.appliance = appliance;
    }

    public abstract void execute();

    public abstract void undo();
}
