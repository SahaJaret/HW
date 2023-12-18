package HW.Book;

public interface Library {
    boolean addBook(Book book);
    Book removeBook(String ISBN);
    Book findBook(String ISBN);
    int quantity();
    void printBooks();
}