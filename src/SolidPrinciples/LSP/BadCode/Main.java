package SolidPrinciples.LSP.BadCode;

public class Main {
   public static void main(String[] args){
       ReadOnlyFile readOnlyFile = new ReadOnlyFile();
       readOnlyFile.read();
       //Violation of LSp
       readOnlyFile.write();
   }
}
