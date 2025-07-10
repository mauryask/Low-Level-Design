package DesignPatterns.BehavioralPattern.Iterator;

public class Book implements Comparable<Book> {
    private final String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    @Override
    public int compareTo(Book o) {
        return this.bookTitle.compareTo(o.bookTitle);
    }
}
