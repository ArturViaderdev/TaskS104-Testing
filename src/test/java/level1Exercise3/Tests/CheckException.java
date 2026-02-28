package level1Exercise3.Tests;
import level1Exercise3.ListPosAccess;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CheckException
{
    @Test
    public void check()
    {
        ListPosAccess l = new ListPosAccess();
        assertThrows(IndexOutOfBoundsException.class, () -> l.getNumber(l.getSize()));
    }
}
