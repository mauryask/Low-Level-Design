package Practice.TradingPlatform.orderchain;

import Practice.TradingPlatform.repository.Order;
import Practice.TradingPlatform.repository.Stock;
import Practice.TradingPlatform.repository.Trader;

public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public void checkNext(Order order) {
        if (next != null)
            next.handle(order);
    }

    protected abstract void handle(Order order);
}
