package SolidPrinciples.LSP.GoodExample;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Television television = new Television();
        SmartHomeManager smartHomeManager = new SmartHomeManager();
        smartHomeManager.setPartyMode(List.of(coffeeMachine, television));
        smartHomeManager.setDeviceVolume(List.of(television));
    }
}
