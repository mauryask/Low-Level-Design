package DesignPatterns.BehavioralPattern.Mediator.GoodExample;

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
    public void handleEvent(String event, Device sender) {
        for (Device device : devices) {
            if (sender != device) {
                device.receiveEvent(event);
            }
        }
    }
}
