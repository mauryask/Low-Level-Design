package DesignPatterns.BehavioralPattern.Observer;

public class SmartTVs implements Observer {
    private final String deviceName;

    public SmartTVs(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(double temperature) {
        System.out.println("Showing temperature on: " + deviceName + " :: " + temperature);
    }
}
