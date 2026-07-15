package Practice.SmartSmoothieMaker.state;

import Practice.SmartSmoothieMaker.smoothie.BaseFluid;
import Practice.SmartSmoothieMaker.smoothie.Ingredient;

import java.util.List;

public abstract class State {
    protected final VendingMachine vendingMachine;

    public State(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract Result dispenseSmoothie(BaseFluid baseFluid, List<Ingredient> ingredient);

    public void onEnterState() {
    }
}