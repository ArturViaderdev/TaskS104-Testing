package level1Exercise1;
import level1Exercise1.exceptions.NotFoundBookException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library()
    {
        books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        if (!(existBook(book)))
        {
            books.add(book);
        }
    }

    public List<Book> getBooks()
    {
        return books;
    }

    public String getBookTitle(int position)
    {
        return books.get(position).getName();
    }

    public boolean existBook(Book book)
    {
        boolean found = false;
        for(int cont=0;cont<books.size();cont++)
        {
            if(book.equals(books.get(cont)))
            {
                found = true;
                break;
            }
        }
        return found;
    }

    public void addBookInPosition(Book book, int position)
    {
        //Can do error
        if(!existBook(book)) {
            books.add(position, book);
        }
    }

    public void deleteBookByTitle(String title) throws NotFoundBookException {
        boolean found = false;
        int cont =0;
        for(cont=0;cont<books.size();cont++)
        {
            if(books.get(cont).getName().equals(title))
            {
                found = true;
                break;
            }
        }
        if(found)
        {
            books.remove(cont);
        }
        else
        {
            throw new NotFoundBookException();
        }
    }

    public List<Book> getBooksOrderedByTitle()
    {
        List<Book> orderedList = new ArrayList<>(books);
        Collections.sort(orderedList);
        return orderedList;
    }
}
