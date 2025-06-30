package SolidPrinciples.LSP.GoodCode;

public class Main {
    public static void readAnyFile(ReadableFile file) {
        file.read();
    }

    public static void main(String[] args) {
        ReadableFile readableFile = new ReadableFile();
        readAnyFile(readableFile);
        WritableFile writableFile = new WritableFile();
        readAnyFile(writableFile);
        writableFile.write();
    }
}
