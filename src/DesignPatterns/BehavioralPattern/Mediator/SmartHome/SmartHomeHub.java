package DesignPatterns.BehavioralPattern.Mediator.SmartHome;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub implements HomeMediator {
    private final List<Device> devices;

    public SmartHomeHub() {
        devices = new ArrayList<>();
    }

    @Override
    public void registerDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void handleEvent(HomeEvent event, Device sender) {
        for (Device device : devices) {
            if (sender != device) {
                device.receiveEvent(event);
            }
        }
    }
}
