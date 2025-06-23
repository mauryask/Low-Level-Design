package paymentsystem;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private Map<String, PaymentMethod> map;

    public PaymentService() {
        map = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod paymentMethod) {
        map.put(name, paymentMethod);
    }

    public void makePayment(String name) {
        PaymentMethod paymentMethod = map.get(name);
        paymentMethod.pay();//Runtime polymorphism
    }
}
