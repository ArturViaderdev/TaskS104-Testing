package level2Exercise4.Tests;

import level2Exercise4.Data;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;

public class ObjectsTest {

    private void addObjects(List<Object> list)
    {
        list.add("artur");
        list.add(5);
        list.add(3.3);
        list.add(new Data(5, "text"));
    }

    private void addObjectsInOtherOrder(List<Object> list)
    {
        list.add(new Data(5, "text"));
        list.add(5);
        list.add("artur");
        list.add(3.3);
    }

    @Test
    public void check() {
        List<Object> list;
        list = new ArrayList<>();
        addObjects(list);
        List<Object> checkList = new ArrayList<>();
        addObjects(checkList);
        Assertions.assertEquals(list,checkList);
        //assertThat(list).containsExactly("artur",5,3.3,new Data(5,"text"));
    }

    @Test
    public void checkContains()
    {
        List<Object> list;
        list = new ArrayList<>();
        addObjects(list);
        List<Object> checkList = new ArrayList<>();
        addObjectsInOtherOrder(checkList);
        Assertions.assertEquals(list.size(),checkList.size());
        Assertions.assertTrue(checkList.containsAll(list));
        //assertThat(list).containsExactlyInAnyOrder("artur",5,3.3,new Data(5,"text"));
    }
}
