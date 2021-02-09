import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Catcher in the Rye", "J. D. Salinger", "Novel");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Catcher in the Rye", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("J. D. Salinger", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Novel", book.getGenre());
    }
}
