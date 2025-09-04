package DesignPatterns.BehavioralPattern.Iterator.BetterCode;

public class ArrayBookCollection implements BookCollection {
    private final String[] books;
    private static final int MAX_SIZE = 100;
    private int size;

    ArrayBookCollection() {
        books = new String[MAX_SIZE];
        size = 0;
    }

    void addBook(String book) {
        if (size < MAX_SIZE)
            books[size++] = book;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books, size);
    }
}
