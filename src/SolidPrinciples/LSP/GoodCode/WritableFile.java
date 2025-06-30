package SolidPrinciples.LSP.GoodCode;

//The writable files are going to support Read+Write both
public class WritableFile extends ReadableFile implements Writable{
    @Override
    public void write() {
        System.out.println("File is being written...");
    }
}
