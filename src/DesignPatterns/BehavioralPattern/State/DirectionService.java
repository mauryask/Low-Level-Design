package DesignPatterns.BehavioralPattern.State;

//Context: holds the reference to the current state
public class DirectionService {
    private TransportationMode transportationMode;

    public DirectionService(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public void setTransportationMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public int calculateETA() {
        return this.transportationMode.calculateETA();
    }

    public String getDirection() {
        return this.transportationMode.getDirection();
    }
}
