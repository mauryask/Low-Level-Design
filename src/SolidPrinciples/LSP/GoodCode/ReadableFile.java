package SolidPrinciples.LSP.GoodCode;

// The files that are read only
public class ReadableFile implements Readable{
    @Override
    public void read(){
        System.out.println("File is being read..");
    }
}
