package DesignPatterns.BehavioralPattern.Visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(12.0), new Rectangle(12, 10), new Triangle(3, 8));
        XMLExportVisitor xmlExportVisitor = new XMLExportVisitor();

        for (Shape shape : shapes) {
            shape.accept(xmlExportVisitor);
            System.out.println(xmlExportVisitor.getXMLShape());
        }

        AreaVisitor areaVisitor = new AreaVisitor();

        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
            System.out.println(areaVisitor.getArea());
        }
    }
}
