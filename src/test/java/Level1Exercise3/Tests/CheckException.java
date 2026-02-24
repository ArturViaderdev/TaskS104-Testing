package Level1Exercise3.Tests;
import Level1Exercise3.ListPosAccess;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CheckException
{
    @Test
    public void check()
    {
        ListPosAccess l = new ListPosAccess();
        //Test is passed because it access to an inexistent element and IndexOutOfBounds exception is thrown
        assertThrows(IndexOutOfBoundsException.class, () -> l.getNumber(l.getSize()));
    }
}
