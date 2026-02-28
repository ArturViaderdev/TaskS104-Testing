package level2Exercise4.Tests;

import level2Exercise4.Data;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ObjectsTest {

    private void addObjects(List<Object> list)
    {

        list.add("artur");
        list.add(5);
        list.add(3.3);
        list.add(new Data(5, "text"));
    }
    @Test
    public void check() {
        List<Object> list;
        list = new ArrayList<>();
        addObjects(list);
        assertThat(list).containsExactly("artur",5,3.3,new Data(5,"text"));
    }

    @Test
    public void checkContains()
    {
        List<Object> list;
        list = new ArrayList<>();
        addObjects(list);
        assertThat(list).containsExactlyInAnyOrder("artur",5,3.3,new Data(5,"text"));
    }
}
