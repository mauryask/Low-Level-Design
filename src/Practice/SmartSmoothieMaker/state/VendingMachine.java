package Practice.SmartSmoothieMaker.state;

import Practice.SmartSmoothieMaker.smoothie.*;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class VendingMachine {
    private final State readyState;
    private final State outOfOrderState;
    private final State cleaningState;
    /*
     * As multiple scheduler threads might change the currentState variable
     * volatile keyword ensured the visibility of the variable to te other threads as soon
     * as they are modified
     * * Another way is making setCurrentState() method synchronized
     *  But it is significantly slower as compare to the volatile
     * */
    private volatile State currentState;
    private int smoothieCount;
    private final ScheduledExecutorService executorService;

    public VendingMachine() {
        readyState = new ReadyState(this);
        outOfOrderState = new OutOfOrderState(this);
        cleaningState = new CleaningState(this);
        currentState = readyState;
        executorService = Executors.newSingleThreadScheduledExecutor();
    }

    public State getReadyState() {
        return readyState;
    }

    public State getOutOfOrderState() {
        return outOfOrderState;
    }

    public State getCleaningState() {
        return cleaningState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        currentState.onEnterState();
    }

    public int getSmoothieCount() {
        return smoothieCount;
    }

    public void incrementSmoothieCount() {
        smoothieCount++;
    }

    public void resetSmoothieCount() {
        smoothieCount = 0;
    }

    public Result dispense(BaseFluid baseFluid, List<Ingredient> ingredients) {
        return currentState.dispenseSmoothie(baseFluid, ingredients);
    }

    protected Smoothie addIngredients(Smoothie smoothie, Ingredient ingredient) {
        return switch (ingredient) {
            case BANANA -> new BananaDecorator(smoothie);
            case BERRIES -> new BerriesDecorator(smoothie);
            case PROTEIN_POWDER -> new ProteinPowderDecorator(smoothie);
            default -> throw new IllegalArgumentException("The ingredient is not available");
        };
    }

    // Schedule a 5 minuted cleaning
    public void scheduleCleaning() {
        executorService.schedule(() -> {
            resetSmoothieCount(); //reset smoothieCount back to 0
            setCurrentState(getReadyState());
        }, 5, TimeUnit.SECONDS);
    }
}