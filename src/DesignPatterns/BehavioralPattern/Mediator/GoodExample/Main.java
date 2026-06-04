package DesignPatterns.BehavioralPattern.Mediator.GoodExample;

/**
 * Consider the example:
 * When the alarm rings
 * 1. The coffee machine starts brewing up coffee
 * 2. The blind machine opens up
 * Instead of these device communicating directly they communicate through a mediator SmartHomeHub
 *
 */

public class Main {
    public static void main(String[] args) {
        HomeMediator mediator = new SmartHomeHub();

        // Create devices
        Device alarmClock = new AlarmClock(mediator);
        Device coffeeMachine = new CoffeeMachine(mediator);
        Device blindMachine = new BlindMachine(mediator);

        // Register devices
        mediator.registerDevice(alarmClock);
        mediator.registerDevice(coffeeMachine);
        mediator.registerDevice(blindMachine);

        //Trigger alarm
        alarmClock.sendEvent("ALARM_RINGING");
    }
}


/**
 * Below is bad code example
 * OCP violation: If coffee machine changes its method name form brewCoffee() top something else the AlarmClock class need to be modified
 * DIP violation
 * AlarmClock class can not be used in different home without bringing the coffee machine and blind machine on board
 *
 */
class BadAlarmClock {
    void ringAlarm() {
        // brewCoffee();
        // OpenBlindMachine();
    }
}