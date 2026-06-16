package DesignPatterns.Structural.Facade.SmartHome;

class SmartLights {
    public void turnOff() {
        System.out.println("Turning all the lights off!!");
    }
}

class SmartLock {
    public void lockAll() {
        System.out.println("Locking all the doors!!");
    }
}

class SecurityAlarm {
    public void arm() {
        System.out.println("Armed security alarm!!");
    }
}

class Thermostat {
    public void setEcoMode() {
        System.out.println("Setting thermostat temperature to Eco mode!!");
    }
}

public class SmartHomeFacade {
    private final SmartLights smartLights;
    private final SmartLock smartLock;
    private final SecurityAlarm securityAlarm;
    private final Thermostat thermostat;

    public SmartHomeFacade() {
        smartLights = new SmartLights();
        smartLock = new SmartLock();
        securityAlarm = new SecurityAlarm();
        thermostat = new Thermostat();
    }

    public void leaveHome() {
        smartLock.lockAll();
        smartLights.turnOff();
        securityAlarm.arm();
        thermostat.setEcoMode();
    }
}
