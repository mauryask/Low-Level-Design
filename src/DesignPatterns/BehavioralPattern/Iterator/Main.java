package DesignPatterns.BehavioralPattern.Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        BookCollection bookCollection = new BookCollection();
        BookCollectionV1 bookCollection = new BookCollectionV1();
        bookCollection.addBook(new Book("Hunger Games"));
        bookCollection.addBook(new Book("Harry Potter"));
        bookCollection.addBook(new Book("A Song of Ice and Fire"));
        Iterator<Book> itr = bookCollection.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next().getBookTitle());
        }
    }
}
