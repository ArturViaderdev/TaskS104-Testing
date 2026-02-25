package Level2Exercise7.Tests;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class TestOptionalEmpty {
    @Test
    public void checkOptionalEmpty()
    {
        Optional<String> optional = Optional.empty();
        assertThat(optional).isEmpty();
    }
}
