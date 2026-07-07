package DesignPatterns.BehavioralPattern.Command.Appliance;

// Receiver: Knows how to perform the actual work
public class Speaker implements Appliance{
    @Override
    public void turnOn() {
        System.out.println("Turning speaker on..");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning speaker off..");
    }
}
