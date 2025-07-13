package DesignPatterns.CreationalDesign.Factory;

public class Bus implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering by Bus..");
    }
}
