package DesignPatterns.BehavioralPattern.Mediator.GoodExample;

public abstract class Device {
    protected final HomeMediator mediator;

    public Device(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receiveEvent(String event);

    public abstract void sendEvent(String event);
}
