package SolidPrinciples.LSP.GoodCode;

public class ReadableFile implements Readable{
    @Override
    public void read(){
        System.out.println("File is being read..");
    }
}
