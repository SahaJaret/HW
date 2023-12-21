package HW.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryImpl implements Library {
    private List<Book> books;
    private int capacity;

    public LibraryImpl(int capacity) {
        this.books = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    @Override
    public boolean addBook(Book book) {
        if (book == null || books.size() >= capacity || findBook(book.getISBN()) != null) {
            return false;
        }
        books.add(book);
        return true;
    }

    @Override
    public Book removeBook(String ISBN) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)) {
                return books.remove(i);
            }
        }
        return null;
    }

    @Override
    public Book findBook(String ISBN) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)) {
                return books.get(i);
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return books.size();
    }

    @Override
    public void printBooks() {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN() + ", Published in: " + book.getPublicationYear());
        }
    }
}