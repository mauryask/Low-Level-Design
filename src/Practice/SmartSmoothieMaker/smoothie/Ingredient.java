package Practice.SmartSmoothieMaker.smoothie;

public enum Ingredient {
    BANANA(10, 25.0),
    PROTEIN_POWDER(10, 35.0),
    BERRIES(20, 15.0);

    private final int prepTime;
    private final double price;

    Ingredient(int prepTime, double price) {
        this.prepTime = prepTime;
        this.price = price;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public double getPrice() {
        return price;
    }
}