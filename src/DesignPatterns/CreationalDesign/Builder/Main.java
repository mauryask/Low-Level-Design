package DesignPatterns.CreationalDesign.Builder;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Brick", "Concrete", "Wood")
                .setParking(true)
                .setGarden(true)
                .setSwimmingPool(false)
                .build();
        System.out.println(house);
    }
}
