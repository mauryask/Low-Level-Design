package Practice.SmartSmoothieMaker.state;

import Practice.SmartSmoothieMaker.smoothie.BaseFluid;
import Practice.SmartSmoothieMaker.smoothie.BaseSmoothie;
import Practice.SmartSmoothieMaker.smoothie.Ingredient;
import Practice.SmartSmoothieMaker.smoothie.Smoothie;

import java.util.List;

public class ReadyState extends State {
    public ReadyState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public Result dispenseSmoothie(BaseFluid baseFluid, List<Ingredient> ingredient) {
        Smoothie smoothie = new BaseSmoothie(baseFluid);

        vendingMachine.incrementSmoothieCount();

        for (Ingredient i : ingredient) {
            smoothie = vendingMachine.addIngredients(smoothie, i);
        }

        // Assign task to background worker thread while keep the next line execution
        if (vendingMachine.getSmoothieCount() >= 3) {
            vendingMachine.setCurrentState(vendingMachine.getCleaningState());
        }

        return new Result(smoothie, true);
    }
}