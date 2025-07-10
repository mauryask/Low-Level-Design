package DesignPatterns.BehavioralPattern.State;

public class Car implements TransportationMode{
    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA for car");
        return 5;
    }

    @Override
    public String getDirection() {
        return "Direction Car route...";
    }
}
