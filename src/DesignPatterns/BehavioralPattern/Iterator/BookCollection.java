package DesignPatterns.BehavioralPattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Iterator<Book> getBookIterator() {
        return new BookIterator(this.books);
    }

    //This class is defined as nested private here cause: the logic within the clas depends on the Collection defined in the main class
    private class BookIterator implements Iterator<Book> {
        private final List<Book> books;
        private int position = 0;

        public BookIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public Book next() {
            return books.get(position++);
        }
    }
}
