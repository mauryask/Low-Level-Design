package SolidPrinciples.ISP.GoodCode;

//Simple machine only supports copying and printing not scanning: Hence violation of ISP
public class SimplePrinter implements Printer {
    @Override
    public void print(Document doc) {
         System.out.println("The Document is being printed..");
    }
}
