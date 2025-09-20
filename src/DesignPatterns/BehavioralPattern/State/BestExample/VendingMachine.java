package DesignPatterns.BehavioralPattern.State.BestExample;

public class VendingMachine {
    private State moneyInsertedState;
    private State outOfStockState;
    private State waitingForMoneyState;
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
