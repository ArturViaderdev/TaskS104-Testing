package level2Exercise1.Tests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CheckIntegers {
    @Test
    public void correctNumbers()
    {
        int i = 2;
        int j = 2;
        Assertions.assertEquals(i,j);
    }

    @Test
    public void incorrectNumbers()
    {
        int i=2;
        int j = 3;
        Assertions.assertNotSame(i,j);
    }
}
