package DesignPatterns.BehavioralPattern.Observer;

//Observer: queries the subject to get the updates
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
