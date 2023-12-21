package HW.Book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    private Library library;
    private Book book1;
    private Book book2;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(10);
        book1 = new Book("ISBN1", "Author1", "Title1", 2001);
        book2 = new Book("ISBN2", "Author2", "Title2", 2002);
    }

    @Test
    void testAddBook() {
        assertTrue(library.addBook(book1));
        assertTrue(library.addBook(book2));
        assertEquals(2, library.quantity());
    }

    @Test
    void testRemoveBook() {
        library.addBook(book1);
        assertEquals(book1, library.removeBook(book1.getISBN()));
        assertNull(library.removeBook(book1.getISBN()));
        assertEquals(0, library.quantity());
    }

    @Test
    void testFindBook() {
        library.addBook(book2);
        assertEquals(book2, library.findBook(book2.getISBN()));
        assertNull(library.findBook(book1.getISBN()));
    }

    @Test
    void testQuantity() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.quantity());
    }
}
