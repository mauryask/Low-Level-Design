package DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponents {
    private final String name;
    private final List<FileSystemComponents> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponents component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder:: " + name);
        for (FileSystemComponents component : components) {
            component.showDetails();
        }
    }
}
