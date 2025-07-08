package DesignPatterns.BehavioralPattern.Observer;

public class MobileDevice implements Observer {
    private final String deviceName;

    public MobileDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(double temperature) {
        System.out.println("Showing temperature on: " + deviceName + " :: " + temperature);
    }
}
