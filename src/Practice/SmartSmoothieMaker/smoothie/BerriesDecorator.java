package Practice.SmartSmoothieMaker.smoothie;

public class BerriesDecorator extends SmoothieDecorator {
    public BerriesDecorator(Smoothie decoratedSmoothie) {
        super(decoratedSmoothie);
    }

    @Override
    public String getDescription() {
        return super.getDescription()  + ", "+  Ingredient.BERRIES.name();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + Ingredient.BERRIES.getPrice();
    }

    @Override
    public double getTime() {
        return super.getTime() + Ingredient.BERRIES.getPrepTime();
    }
}