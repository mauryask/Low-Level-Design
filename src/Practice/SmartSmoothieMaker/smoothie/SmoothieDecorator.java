package Practice.SmartSmoothieMaker.smoothie;

public class SmoothieDecorator implements Smoothie {
    private final Smoothie decoratedSmoothie;

    public SmoothieDecorator(Smoothie decoratedSmoothie) {
        this.decoratedSmoothie = decoratedSmoothie;
    }

    @Override
    public double getPrice() {
        return decoratedSmoothie.getPrice();
    }

    @Override
    public double getTime() {
        return decoratedSmoothie.getTime();
    }

    @Override
    public String getDescription() {
        return decoratedSmoothie.getDescription();
    }
}
