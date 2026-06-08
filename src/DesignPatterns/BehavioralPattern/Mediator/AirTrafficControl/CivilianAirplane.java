package DesignPatterns.BehavioralPattern.Mediator.AirTrafficControl;

public class CivilianAirplane extends Airplane {
    public CivilianAirplane(AirTrafficControlMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveClearance(String message) {
        System.out.println("CivilianPlane:: " + message);
    }

    @Override
    public void requestTakeOff() {
        mediator.requestTakeOff(this);
    }

    @Override
    public void requestLanding() {
        mediator.requestLanding(this);
    }
}
