package DesignPatterns.BehavioralPattern.Mediator.SmartHome;

public class BlindMachine extends Device {
    public BlindMachine(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveEvent(HomeEvent event) {
        if (event == HomeEvent.ALARM_RINGING) openBlind();
    }

    @Override
    public void sendEvent(HomeEvent event) {
        mediator.handleEvent(event, this);
    }

    private void openBlind() {
        System.out.println("Blind machine opened up..");
    }
}
