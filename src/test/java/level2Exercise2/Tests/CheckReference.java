package level2Exercise2.Tests;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertSame;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


public class CheckReference {
    @Test
    public void checkSame()
    {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = a;
        assertThat(a).isSameAs(b);
    }

    @Test
    public void checkNoSame()
    {
        String a = new String("1");
        String b = new String("1");
        assertThat(a).isNotSameAs(b);
    }
}
