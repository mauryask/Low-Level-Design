package DesignPatterns.BehavioralPattern.State;

public class Train implements TransportationMode{
    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA for train");
        return 21;
    }

    @Override
    public String getDirection() {
        return "Direction Train route...";
    }
}
