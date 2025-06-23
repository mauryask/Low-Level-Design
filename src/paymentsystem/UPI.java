package paymentsystem;

public class UPI implements PaymentMethod{
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    @Override
    public void pay() {
        System.out.println("Making payment via UPI: " + getUpiId());
    }
}
