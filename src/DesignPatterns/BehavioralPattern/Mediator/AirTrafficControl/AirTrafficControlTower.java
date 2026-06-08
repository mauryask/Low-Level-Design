package DesignPatterns.BehavioralPattern.Mediator.AirTrafficControl;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControlTower implements AirTrafficControlMediator {
    private final List<Airplane> airplanes;
    private boolean isRunWayBusy = false;

    public AirTrafficControlTower() {
        airplanes = new ArrayList<>();
    }

    @Override
    public void registerAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    @Override
    public void requestTakeOff(Airplane airplane) {
        if (isRunWayBusy) {
            airplane.receiveClearance("Runway is busy!! Please try not to land.");
        } else {
            isRunWayBusy = true;
            for (Airplane plane : airplanes) {
                plane.receiveClearance("Runway is busy!! Please do not take off!!");
            }
        }
    }

    @Override
    public void requestLanding(Airplane airplane) {

    }
}
