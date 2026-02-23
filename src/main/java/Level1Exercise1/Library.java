package Level1Exercise1;

import java.util.ArrayList;
import java.util.Arrays;
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
        if (!(existbook(book)))
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

    public boolean existbook(Book book)
    {
        boolean exit = false;
        boolean found = false;
        int cont = 0;
        while(!exit)
        {
            if(cont<books.size())
            {
                if(book.equals(books.get(cont)))
                {
                    found = true;
                    exit = true;
                }
                else
                {
                    cont++;
                }
            }
            else
            {
                exit = true;
            }
        }
        return found;
    }

    public void addBookInPosition(Book book, int position)
    {
        //Can do error
        if(!existbook(book)) {
            books.add(position, book);
        }
    }

    public void deleteBookByTitle(String title)
    {
        int cont = 0;
        boolean sal = false;
        boolean encontrado = false;
        while(!sal)
        {
            if(cont<books.size())
            {
                if(books.get(cont).getName().equals(title))
                {
                    encontrado = true;
                    sal = true;
                }
                else
                {
                    cont++;
                }
            }
            else
            {
                sal = true;
            }
        }
        if(encontrado)
        {
            books.remove(cont);
        }
        else
        {
            //error
        }
    }

    public List<Book> getBooksOrderedByTitle()
    {
        List<Book> orderedList = new ArrayList<>(books);
        Collections.sort(orderedList);
        return orderedList;
    }
}
