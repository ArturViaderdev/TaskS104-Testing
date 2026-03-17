package level2Exercise6.Tests;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class TestException {
    @Test
    public void checkIndexOutOfBoundsException()
    {
        ArrayIndexOutOfBoundsException exception = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int[] numbers = {4,5,6,3};
            int intexistent = numbers[4];
        });

        /*
        assertThatThrownBy(() -> {
            int[] numbers = {4,5,6,3};
            int intexistent = numbers[4];
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);*/
    }
}
