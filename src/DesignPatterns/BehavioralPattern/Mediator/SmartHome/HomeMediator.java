package DesignPatterns.BehavioralPattern.Mediator.SmartHome;

public interface HomeMediator {
    void registerDevice(Device device);
    void handleEvent(HomeEvent event, Device sender);
}
