import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("Lion Witch and the Wardrobe", "C.S Lewis", "Fantasy");
        book2 = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
        book3 = new Book("The Far Away Tree", "Rhiannon", "Fantasy");
        book4 = new Book("Romeo and Juliet", "Shakespeare", "Old");
        borrower = new Borrower();
    }

    @Test
    public void collectionHasNoBooks(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void addBookToCollection(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
        borrower.takeBookFromLibrary(library, book2);
        assertEquals(1, borrower.collectionCount());
        assertEquals(1, library.bookCount());
    }
}
