package DesignPatterns.CreationalDesign.Builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("32GB", "1TB")
                .setBluetoothAvailable(true)
                .setWifiAvailable(true) // Optional can be avoided
                .build();
    }
}
