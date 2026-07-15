package Practice.SmartSmoothieMaker.smoothie;

public class BaseSmoothie implements Smoothie {
    private final BaseFluid baseFluid;

    public BaseSmoothie(BaseFluid baseFluid) {
        this.baseFluid = baseFluid;
    }

    @Override
    public double getPrice() {
        return baseFluid.getPrice();
    }

    @Override
    public double getTime() {
        return 30;
    }

    @Override
    public String getDescription() {
        return baseFluid.name();
    }
}