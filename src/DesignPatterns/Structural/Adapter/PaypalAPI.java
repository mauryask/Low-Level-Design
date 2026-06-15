package DesignPatterns.Structural.Adapter;

/**
 * PayPal API woith pay method but user wants it to be processPayment() method
 * We have attached an adapter to it without distrubing the existing code
 */

public class PaypalAPI {
    void pay(double amount) {
        System.out.println("Paying " + amount + " via PayPal payment service!!");
    }
}
