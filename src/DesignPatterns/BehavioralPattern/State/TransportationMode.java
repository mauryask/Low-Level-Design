package DesignPatterns.BehavioralPattern.State;

public interface TransportationMode {
    //ETA: Estimated time to arrival
    int calculateETA();

    String getDirection();
}