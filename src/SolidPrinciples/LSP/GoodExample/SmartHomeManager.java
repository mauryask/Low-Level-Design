package SolidPrinciples.LSP.GoodExample;

import java.util.List;

public class SmartHomeManager {
    public void setPartyMode(List<ElectronicSystem> devices) {
        for (ElectronicSystem device : devices) {
            device.turnOn();
        }
    }

    public void setDeviceVolume(List<AudioSystem> devices) {
        for (AudioSystem device : devices) {
            device.setVolume();
        }
    }
}
