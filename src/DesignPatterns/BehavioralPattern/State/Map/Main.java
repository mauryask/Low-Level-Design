package DesignPatterns.BehavioralPattern.State.Map;

public class Main {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Walking());
        directionService.setTransportationMode(new Car());
        System.out.println(directionService.calculateETA());
        System.out.println(directionService.getDirection());
    }
}
