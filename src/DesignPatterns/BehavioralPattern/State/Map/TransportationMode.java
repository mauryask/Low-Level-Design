package DesignPatterns.BehavioralPattern.State.Map;

public interface TransportationMode {
    //ETA: Estimated time to arrival
    int calculateETA();

    String getDirection();
}