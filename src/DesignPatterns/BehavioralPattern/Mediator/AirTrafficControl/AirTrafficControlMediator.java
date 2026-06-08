package DesignPatterns.BehavioralPattern.Mediator.AirTrafficControl;

public interface AirTrafficControlMediator {
    void registerAirplane(Airplane airplane);
    void requestTakeOff(Airplane airplane);
    void requestLanding(Airplane airplane);
}
