package DesignPatterns.BehavioralPattern.TemplateMethod;

public class JSONParser extends DataParser{
    @Override
    void parseData() {
        System.out.println("Parsing JSON data..");
    }
}
