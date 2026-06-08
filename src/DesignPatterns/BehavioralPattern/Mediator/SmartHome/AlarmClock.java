package DesignPatterns.BehavioralPattern.Mediator.SmartHome;

public class AlarmClock extends Device {
    public AlarmClock(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveEvent(HomeEvent event) {
        // Perform some action
    }

    @Override
    public void sendEvent(HomeEvent event) {
        mediator.handleEvent(event, this);
    }
}
