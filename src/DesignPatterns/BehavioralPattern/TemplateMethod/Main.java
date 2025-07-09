package DesignPatterns.BehavioralPattern.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        DataParser jsonParse = new JSONParser();
        DataParser csvParse = new CSVParser();
        jsonParse.parse();
        csvParse.parse();
    }
}
