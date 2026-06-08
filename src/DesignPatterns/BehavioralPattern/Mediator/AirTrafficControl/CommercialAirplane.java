package DesignPatterns.BehavioralPattern.Mediator.AirTrafficControl;

public class CommercialAirplane extends Airplane {
    public CommercialAirplane(AirTrafficControlMediator mediator) {
        super(mediator);
    }

    @Override
    public void requestTakeOff() {
        mediator.requestTakeOff(this);
    }

    @Override
    public void receiveClearance(String message) {
        System.out.println("CommercialPlane:: "+ message);
    }

    @Override
    public void requestLanding() {
        mediator.requestLanding(this);
    }
}
