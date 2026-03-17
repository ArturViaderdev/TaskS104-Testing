package level2Exercise7.Tests;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;

public class TestOptionalEmpty {
    @Test
    public void checkOptionalEmpty()
    {
        Optional<String> optional = Optional.empty();
        Assertions.assertTrue(optional.isEmpty());
        //assertThat(optional).isEmpty();
    }
}
