package Level1Exercise3;

import java.util.ArrayList;
import java.util.List;

public class ListPosAccess {
    List<Integer> list;
    public ListPosAccess()
    {
        list = new ArrayList<>();
    }

    public Integer getNumber(int number)
    {
        return list.get(number);
    }

    public int getSize()
    {
        return list.size();
    }
}
