package DesignPatterns.Structural.Facade;

public class Main {
    public static void main(String[] args) {
        APIGateway gateway = new APIGateway();
        gateway.getOrderInfo("user123", "order456", "payment789");
    }
}
