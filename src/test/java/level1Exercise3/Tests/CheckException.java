package level1Exercise3.Tests;
import level1Exercise3.ListPosAccess;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CheckException
{
    @Test
    public void check()
    {
        ListPosAccess l = new ListPosAccess();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> l.getNumber(l.getSize()));
    }
}
