package DesignPatterns.BehavioralPattern.Mediator.AirTrafficControl;

public abstract class Airplane {
    protected AirTrafficControlMediator mediator;

    public Airplane(AirTrafficControlMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void requestTakeOff();

    public abstract void requestLanding();

    public abstract void receiveClearance(String message);
}
