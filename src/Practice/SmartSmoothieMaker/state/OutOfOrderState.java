package Practice.SmartSmoothieMaker.state;

import Practice.SmartSmoothieMaker.smoothie.BaseFluid;
import Practice.SmartSmoothieMaker.smoothie.Ingredient;

import java.util.List;

public class OutOfOrderState extends State{
    public OutOfOrderState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public Result dispenseSmoothie(BaseFluid baseFluid, List<Ingredient> ingredient) {
        return new Result(null, false);
    }
}