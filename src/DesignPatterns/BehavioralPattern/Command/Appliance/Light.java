package DesignPatterns.BehavioralPattern.Command.Appliance;

// Receiver: Knows how to perform the actual work
public class Light implements Appliance{
    @Override
    public void turnOn() {
        System.out.println("Turning light on..");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning light off..");
    }
}