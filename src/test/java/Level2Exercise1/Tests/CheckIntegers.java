package Level2Exercise1.Tests;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckIntegers {
    @Test
    public void correctNumbers()
    {
        int i = 2;
        int j = 2;
        assertThat(i).isEqualTo(j);
    }

    @Test
    public void incorrectNumbers()
    {
        int i=2;
        int j = 3;
        assertThat(i).isNotEqualTo(j);
    }
}
