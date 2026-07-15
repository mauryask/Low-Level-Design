package Practice.SmartSmoothieMaker.smoothie;

public enum BaseFluid {
    WATER(20.0),
    MILK(30.0),
    ALMOND_MILK(35.0);

    private final double price;

    BaseFluid(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}