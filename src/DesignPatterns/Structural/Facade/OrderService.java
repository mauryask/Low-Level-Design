package DesignPatterns.Structural.Facade;

public class OrderService {
    public void getOrderDetails(String orderId) {
        System.out.println("Order Info:: " + orderId);
    }
}
