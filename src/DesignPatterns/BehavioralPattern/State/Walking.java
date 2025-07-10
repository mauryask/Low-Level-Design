package DesignPatterns.BehavioralPattern.State;

public class Walking implements TransportationMode{
    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA for walking");
        return 12;
    }

    @Override
    public String getDirection() {
        return "Direction Walking route...";
    }
}
