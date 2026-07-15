package Practice.SmartSmoothieMaker.state;

import Practice.SmartSmoothieMaker.smoothie.BaseFluid;
import Practice.SmartSmoothieMaker.smoothie.Ingredient;

import java.util.List;

public class CleaningState extends State {
    public CleaningState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public Result dispenseSmoothie(BaseFluid baseFluid, List<Ingredient> ingredient) {
        return new Result(null, false);
    }

    @Override
    public void onEnterState() {
        vendingMachine.scheduleCleaning();
    }
}