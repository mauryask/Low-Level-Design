package DesignPatterns.BehavioralPattern.State.VendingMachine;

public class OutOfStockState extends State {
    OutOfStockState(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void pressButton() {
        System.out.println("Out of stock..");
    }

    @Override
    public void insertMoney() {
        System.out.println("Can't insert money, as the item is out of stock..");
    }
}
