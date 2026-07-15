package Practice.SmartSmoothieMaker.smoothie;

public class BananaDecorator extends SmoothieDecorator {
    public BananaDecorator(Smoothie decoratedSmoothie) {
        super(decoratedSmoothie);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + Ingredient.BANANA.getPrice();
    }

    @Override
    public double getTime() {
        return super.getTime() + Ingredient.BANANA.getPrepTime();
    }

    @Override
    public String getDescription() {
        return super.getDescription()  + ", "+  Ingredient.BANANA.name();
    }
}