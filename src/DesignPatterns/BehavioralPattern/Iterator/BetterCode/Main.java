package DesignPatterns.BehavioralPattern.Iterator.BetterCode;

public class Main {
    public static void main(String[] args) {
        ArrayBookCollection collection = new ArrayBookCollection();
        collection.addBook("Hary Porter");
        collection.addBook("Song of Ice and Fire");
        collection.addBook("Hunger Games");
        collection.addBook("Gunaho Ka Devta");
        collection.addBook("Gaban");
        collection.addBook("Godan");

        Iterator itr = collection.createIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
