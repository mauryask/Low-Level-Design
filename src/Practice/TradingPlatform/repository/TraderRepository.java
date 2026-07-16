package Practice.TradingPlatform.repository;

import java.util.HashMap;
import java.util.Map;

public class TraderRepository {
    private final Map<Integer, Trader> users = new HashMap<>();

    public boolean traderExists(int accountNo) {
        return users.containsKey(accountNo);
    }

    public void addTrader() {
        for (int i = 50; i <= 60; i++) {
            users.put(i, new Trader(i, i * 10 + 2));
        }
    }
}
