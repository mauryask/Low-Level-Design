package DesignPatterns.BehavioralPattern.Iterator;

import java.util.*;

public class BookCollectionV1 implements Iterable<Book> {
    private final Set<Book> books = new TreeSet<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
