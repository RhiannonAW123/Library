import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before() {
        library = new Library(3);
        book1 = new Book("Lion Witch and the Wardrobe", "C.S Lewis", "Fantasy");
        book2 = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
        book3 = new Book("The Far Away Tree", "Rhiannon", "Fantasy");
        book4 = new Book("Romeo and Juliet", "Shakespeare", "Old");
    }

    @Test
        public void canAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
        public void cannotAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.bookCount());
    }
}