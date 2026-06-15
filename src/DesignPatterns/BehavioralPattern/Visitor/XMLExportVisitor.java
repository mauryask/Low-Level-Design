package DesignPatterns.BehavioralPattern.Visitor;

public class XMLExportVisitor implements Visitor {
    private String xmlShape = "";

    @Override
    public void visitCircle(Circle circle) {
        xmlShape = "<circle>This is a circle</circle>";
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        xmlShape = "<rectangle>This is a rectangle</rectangle>";
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        xmlShape = "<triangle>This is a triangle</triangle>";
    }

    public String getXMLShape() {
        return xmlShape;
    }
}
