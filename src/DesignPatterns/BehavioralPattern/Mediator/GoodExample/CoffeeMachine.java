package DesignPatterns.BehavioralPattern.Mediator.GoodExample;

public class CoffeeMachine extends Device {
    public CoffeeMachine(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveEvent(String event) {
        if (event.equals("ALARM_RINGING")) brewCoffee();
    }

    @Override
    public void sendEvent(String event) {
        mediator.handleEvent(event, this);
    }

    private void brewCoffee() {
        System.out.println("Coffee started brewing..");
    }
}
