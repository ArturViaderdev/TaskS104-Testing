package level2Exercise4;

import java.util.Objects;

public class Data {
    int number;
    String text;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return number == data.number && Objects.equals(text, data.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, text);
    }

    public Data(int number, String text)
    {
        this.number = number;
        this.text = text;
    }
}
