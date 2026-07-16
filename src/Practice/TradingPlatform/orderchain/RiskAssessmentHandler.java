package Practice.TradingPlatform.orderchain;

import Practice.TradingPlatform.repository.Order;

public class RiskAssessmentHandler extends Handler {
    @Override
    protected void handle(Order order) {
        if (order.isRisky()) {
            System.out.println("Your margin limit is less than the order value!!");
            return;
        }
        checkNext(order);
    }
}
