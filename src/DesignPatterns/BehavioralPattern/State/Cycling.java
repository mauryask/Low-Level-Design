package DesignPatterns.BehavioralPattern.State;

public class Cycling implements TransportationMode{
    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA for cycling");
        return 24;
    }

    @Override
    public String getDirection() {
        return "Direction Cycle route...";
    }
}
