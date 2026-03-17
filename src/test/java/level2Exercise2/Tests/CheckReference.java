package level2Exercise2.Tests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.List;



public class CheckReference {
    @Test
    public void checkSame()
    {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = a;
        Assertions.assertSame(a,b);
    }

    @Test
    public void checkNoSame()
    {
        String a = new String("1");
        String b = new String("1");
        Assertions.assertNotSame(a,b);
    }
}
