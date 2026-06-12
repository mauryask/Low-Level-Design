package DesignPatterns.CreationalDesign.Builder;

public class Computer {
    private final String RAM;
    private final String HDD;
    private final boolean isWifiAvailable;
    private final boolean isBluetoothAvailable;

    private Computer(ComputerBuilder builder) {
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.isWifiAvailable = builder.isWifiAvailable;
        this.isBluetoothAvailable = builder.isBluetoothAvailable;
    }

    public static class ComputerBuilder {
        // Mandatory parameters
        private final String RAM;
        private final String HDD;
        // Optional parameter
        private boolean isWifiAvailable;
        private boolean isBluetoothAvailable;

        public ComputerBuilder(String RAM, String HDD) {
            this.RAM = RAM;
            this.HDD = HDD;
        }

        public ComputerBuilder setWifiAvailable(boolean wifiAvailable) {
            this.isWifiAvailable = wifiAvailable;
            return this;
        }

        public ComputerBuilder setBluetoothAvailable(boolean bluetoothAvailable) {
            this.isBluetoothAvailable = bluetoothAvailable;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
