package Practice.TradingPlatform.orderchain;

import Practice.TradingPlatform.repository.Order;


public class ValidationHandler extends Handler {
    @Override
    protected void handle(Order order) {
        if (!order.isValidFormat()) {
            System.out.println("The order is not valid!!");
            return;
        }
        checkNext(order);
    }
}
