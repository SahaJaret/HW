package HW.Book;

public class Book {
    private String ISBN;
    private String author;
    private String title;
    private int publicationYear;

    public Book(String ISBN, String author, String title, int publicationYear) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}