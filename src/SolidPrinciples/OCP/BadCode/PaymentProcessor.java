package SolidPrinciples.OCP.BadCode;

// The code below violates the OCP principle, As it is not open for extension and closed for modification
// If new Payment Method need to be added, We have to modify the Payment Processor class hence violation
public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Processing amount: " + amount + " with CreditCard");
        } else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Processing amount: " + amount + " with DebitCard");
        } else if (paymentMethod.equals("UPI")) {
            System.out.println("Processing amount: " + amount + " with UPI");
        } else {
            throw new IllegalArgumentException("Payment method: " + paymentMethod + " not supported!!");
        }
    }
}
