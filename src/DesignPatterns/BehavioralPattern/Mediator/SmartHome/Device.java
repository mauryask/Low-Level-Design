package DesignPatterns.BehavioralPattern.Mediator.SmartHome;

public abstract class Device {
    protected final HomeMediator mediator;

    public Device(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receiveEvent(HomeEvent event);

    public abstract void sendEvent(HomeEvent event);
}
