package DesignPatterns.BehavioralPattern.Iterator.BetterCode;

public class BookIterator implements Iterator{
    private final int size;
    private final String[] books;
    private int currentIndex;

    BookIterator(String[] books, int size){
        this.size = size;
        this.books = books;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < size;
    }

    @Override
    public String next() {
        return books[currentIndex++];
    }
}
