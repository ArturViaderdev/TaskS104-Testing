package level1Exercise1;

import java.util.Objects;

public class Book  implements Comparable<Book> {
    private String name;
    private String description;
    public Book(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Book book) {
        return this.name.compareTo(book.getName());
    }
}
