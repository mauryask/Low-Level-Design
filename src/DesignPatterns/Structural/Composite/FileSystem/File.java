package DesignPatterns.Structural.Composite.FileSystem;

public class File implements FileSystemComponents {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File:: " + name);
    }
}
