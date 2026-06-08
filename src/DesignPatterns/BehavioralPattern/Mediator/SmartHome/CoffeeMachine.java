package DesignPatterns.BehavioralPattern.Mediator.SmartHome;

public class CoffeeMachine extends Device {
    public CoffeeMachine(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveEvent(HomeEvent event) {
        if (event == HomeEvent.ALARM_RINGING) brewCoffee();
    }

    @Override
    public void sendEvent(HomeEvent event) {
        mediator.handleEvent(event, this);
    }

    private void brewCoffee() {
        System.out.println("Coffee started brewing..");
    }
}
