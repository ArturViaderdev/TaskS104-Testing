package level2Exercise5.Tests;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
public class TestMap {
    @Test
    public void checkMap()
    {
        Map<String,String> map = new HashMap<>();
        map.put("Spain","Madrid");
        map.put("France","Paris");
        Assertions.assertTrue(map.containsKey("France"));
        //assertThat(map).containsKey("France");
    }
}
