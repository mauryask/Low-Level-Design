package SolidPrinciples.LSP.BadCode;

// Violation of LSP as the Read-only file should not be written at all
public class ReadOnlyFile extends File {
    //This function violating LSP
    @Override
    public void write() {
           //Can be handles like this but not a good idea
           throw new IllegalArgumentException("Unsupported operation!!");
    }

    @Override
    public void read() {
        System.out.println("File is being read...");
    }
}
