package DesignPatterns.CreationalDesign.Prototype.GraphicEditor;

public class GraphicEditor {
    public Shape duplicateShape(Shape original) {
        return original.clone();
    }
}
