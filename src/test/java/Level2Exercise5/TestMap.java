package Level2Exercise5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class TestMap {
    @Test
    public void checkMap()
    {
        Map<String,String> map = new HashMap<>();
        map.put("Spain","Madrid");
        map.put("France","Paris");
        assertThat(map).containsKey("France");
    }
}
