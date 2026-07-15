package Practice.SmartSmoothieMaker.smoothie;

public class ProteinPowderDecorator extends SmoothieDecorator {
    public ProteinPowderDecorator(Smoothie decoratedSmoothie) {
        super(decoratedSmoothie);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + Ingredient.PROTEIN_POWDER.getPrice();
    }

    @Override
    public double getTime() {
        return super.getTime() + Ingredient.PROTEIN_POWDER.getPrepTime();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", "+ Ingredient.PROTEIN_POWDER.name();
    }
}