package DesignPatterns.BehavioralPattern.Mediator.GoodExample;

public class BlindMachine extends Device {
    public BlindMachine(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveEvent(String event) {
        if (event.equals("ALARM_RINGING"))  openBlind();
    }

    @Override
    public void sendEvent(String event) {
        mediator.handleEvent(event, this);
    }

    private void openBlind() {
        System.out.println("Blind machine opened up..");
    }
}
