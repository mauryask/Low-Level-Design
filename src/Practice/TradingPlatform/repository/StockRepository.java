package Practice.TradingPlatform.repository;

import java.util.HashMap;
import java.util.Map;

public class StockRepository {
    private final Map<Integer, Stock> stocks = new HashMap<>();

    public Stock stockAvailable(int stockId) {
        return stocks.get(stockId);
    }

    public void addStock() {
        for (int i = 1; i <= 10; i++) {
            stocks.put(i, new Stock(i, i % 3 == 0/*Mark stock restricted*/));
        }
    }
}
