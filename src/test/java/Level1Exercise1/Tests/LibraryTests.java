package Level1Exercise1.Tests;
import Level1Exercise1.Library;
import org.junit.Test;
import static org.junit.Assert.*;

public class BooksNotNull {
    @Test
    public void testNotNullBooks()
    {
        Library library = new Library();
        assertNotNull(library.getBooks());
    }
}
