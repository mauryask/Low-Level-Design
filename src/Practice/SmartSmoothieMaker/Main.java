package Practice.SmartSmoothieMaker;

import Practice.SmartSmoothieMaker.smoothie.BaseFluid;
import Practice.SmartSmoothieMaker.smoothie.Ingredient;
import Practice.SmartSmoothieMaker.state.Result;
import Practice.SmartSmoothieMaker.state.VendingMachine;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Result result = vendingMachine.dispense(BaseFluid.WATER, List.of(Ingredient.BANANA, Ingredient.BERRIES));
        if (result.success()) {
            System.out.printf("Price: %s%nTime: %s%nDescription: %s%n", result.smoothie().getPrice(), result.smoothie().getTime(), result.smoothie().getDescription());
        }
    }
}
