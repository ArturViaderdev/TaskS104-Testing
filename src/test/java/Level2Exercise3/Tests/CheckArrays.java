package Level2Exercise3.Tests;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

public class CheckArrays {
    @Test
    public void check()
    {
       int[] a = new int[3];
       int[] b = new int[3];
       a[0] = 1;
       a[1] = 2;
       a[2] = 3;
       b[0] = 1;
       b[1] = 2;
       b[2] = 3;
       assertThat(a).isEqualTo(b);
    }
}
