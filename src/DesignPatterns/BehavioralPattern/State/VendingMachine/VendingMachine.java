package DesignPatterns.BehavioralPattern.State.VendingMachine;

public class VendingMachine {
    private final State moneyInsertedState;
    private final State outOfStockState;
    private final State waitingForMoneyState;
    private State currentState;

    VendingMachine() {
        moneyInsertedState = new MoneyInsertedState(this);
        outOfStockState = new OutOfStockState(this);
        waitingForMoneyState = new WaitingForMoneyState(this);
        currentState = waitingForMoneyState;
    }

    public State getMoneyInsertedState() {
        return moneyInsertedState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }

    public State getWaitingForMoneyState() {
        return waitingForMoneyState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void pressButton() {
        currentState.pressButton();
    }

    public void insertMoney() {
        currentState.insertMoney();
    }
}
