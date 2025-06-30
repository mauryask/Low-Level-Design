package SolidPrinciples.ISP.GoodCode;

public class MultiPurposeMachine implements Printer, Scanner, Copier {
    @Override
    public void print(Document doc) {
        System.out.println("The Document is being printed..");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("The Document is being scanned..");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("The Document is being copied..");
    }
}
