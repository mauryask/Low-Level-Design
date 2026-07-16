package Practice.TradingPlatform.orderchain;

import Practice.TradingPlatform.repository.Order;


public class ComplianceHandler extends Handler {
    @Override
    protected void handle(Order order) {
        if (order.stock().restricted()) {
            System.out.println("The Stock is on regulatory restriction!!");
            return;
        }
        checkNext(order);
    }
}
