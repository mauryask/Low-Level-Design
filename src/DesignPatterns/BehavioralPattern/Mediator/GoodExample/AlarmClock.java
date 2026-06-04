package DesignPatterns.BehavioralPattern.Mediator.GoodExample;

public class AlarmClock extends Device {
    public AlarmClock(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveEvent(String event) {
        triggerAlarm();
    }

    @Override
    public void sendEvent(String event) {
        mediator.handleEvent(event, this);
    }

    private void triggerAlarm() {
        System.out.println("Alarm is ringing..");
    }
}
