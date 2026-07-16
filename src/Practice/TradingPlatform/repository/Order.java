package Practice.TradingPlatform.repository;

public record Order(Trader trader, Stock stock, int orderValue) {
    public boolean isValidFormat() {
        return trader != null && stock != null;
    }

    public boolean isRisky() {
        return trader.marginLimit() < orderValue;
    }
}
