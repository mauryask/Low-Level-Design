package DesignPatterns.BehavioralPattern.Mediator.AirTrafficControl;

public class Main {
    public static void main(String[] args) {
        AirTrafficControlMediator airTrafficControlTower = new AirTrafficControlTower();
        Airplane civilianPlane = new CivilianAirplane(airTrafficControlTower);
        Airplane commercialPlane = new CommercialAirplane(airTrafficControlTower);
        airTrafficControlTower.registerAirplane(civilianPlane);
        airTrafficControlTower.registerAirplane(commercialPlane);
        civilianPlane.requestTakeOff();
    }
}
