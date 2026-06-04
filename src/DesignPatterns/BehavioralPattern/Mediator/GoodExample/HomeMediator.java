package DesignPatterns.BehavioralPattern.Mediator.GoodExample;

public interface HomeMediator {
    void registerDevice(Device device);
    void handleEvent(String event, Device sender);
}
