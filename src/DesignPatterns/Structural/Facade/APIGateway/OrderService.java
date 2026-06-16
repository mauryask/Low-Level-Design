package DesignPatterns.Structural.Facade.APIGateway;

public class OrderService {
    public void getOrderDetails(String orderId) {
        System.out.println("Order Info:: " + orderId);
    }
}
