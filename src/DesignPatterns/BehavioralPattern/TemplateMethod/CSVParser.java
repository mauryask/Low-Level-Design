package DesignPatterns.BehavioralPattern.TemplateMethod;

public class CSVParser extends DataParser {
    @Override
    void parseData() {
        System.out.println("Parsing CSV data..");
    }
}
