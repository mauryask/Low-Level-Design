package DesignPatterns.CreationalDesign.Factory;

public class Main {
    public static void main(String[] args) {
        Transport transport = TransportService.getTransport("truck");
        transport.deliver();
    }
}
