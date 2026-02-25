package Level2Exercise6.Tests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TestException {
    @Test
    public void checkIndexOutOfBoundsException()
    {
        assertThatThrownBy(() -> {
            int[] numbers = {4,5,6,3};
            int intexistent = numbers[4];
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
