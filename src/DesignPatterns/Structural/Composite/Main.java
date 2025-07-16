package DesignPatterns.Structural.Composite;

public class Main {
    public static void main(String[] args) {
        FileSystemComponents file1 = new File("file1.txt");
        FileSystemComponents file2 = new File("file2.txt");
        Folder folder = new Folder("Documents");
        folder.addComponent(file1);
        folder.addComponent(file2);
        FileSystemComponents file3 = new File("file3.txt");
        Folder subfolder = new Folder("Subfolder");
        subfolder.addComponent(file3);
        folder.addComponent(subfolder);
        //Kind of DFS will occur here to print the file/folder hierarchy
        folder.showDetails();
    }
}
