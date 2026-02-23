package Level1Exercise1.Tests;
import Level1Exercise1.Book;
import Level1Exercise1.Library;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTests {
    @Test
    public void testNotNullBooks()
    {
        Library library = new Library();
        assertNotNull(library.getBooks());
    }

    private void addthreebooks(Library library)
    {
        library.addBook(new Book("Titol","Descripcio"));
        library.addBook(new Book("Titol2","Descripcio2"));
        library.addBook(new Book("Titol3","Descripcio3"));
    }

    @Test
    public void booksizecorrect()
    {
        Library library = new Library();
        addthreebooks(library);
        assertTrue(3==library.getBooks().size());
    }

    @Test
    public void bookCorrectPosition()
    {
        boolean correct = true;
        Library library = new Library();
        addthreebooks(library);
        int size = library.getBooks().size();
        List<Book> books = library.getBooks();
        assertTrue(books.get(size-1).getName().equals("Titol3") && books.get(size-2).getName().equals("Titol2") && books.get(size-3).getName().equals("Titol"));
    }

    @Test
    public void bookTitleCorrect()
    {
        Library library = new Library();
        addthreebooks(library);
        assertTrue(library.getBookTitle(library.getBooks().size()-2).equals(library.getBooks().get(library.getBooks().size()-2).getName()));
    }

    @Test
    public void addBookPosition()
    {
        Library library = new Library();
        addthreebooks(library);
        List<Book> original = library.getBooks();
        int position = 1;
        library.addBookInPosition(new Book("Second book","Description"),position);;
        int cont =0;
        boolean sal = true;
        boolean correct = true;
        while(!sal)
        {
            if(cont<library.getBooks().size())
            {
                if(cont<position)
                {
                    if(!(original.get(cont).equals(library.getBooks().get(cont))))
                    {
                        sal = true;
                        correct = false;
                    }
                    else
                    {
                        cont++;
                    }
                }
                else if(cont==position)
                {
                    if(!(library.getBooks().get(cont).getName().equals("Second book")))
                    {
                        sal = true;
                        correct = false;
                    }
                    else
                    {
                        cont++;
                    }
                }
                else
                {
                    if(!(original.get(cont-1).equals(library.getBooks().get(cont))))
                    {
                        sal = true;
                        correct = false;
                    }
                    else
                    {
                        cont++;
                    }
                }
            }
            else
            {
                sal = true;
            }
        }
        assertTrue(correct);
    }

    @Test
    public void deleteBookTitle()
    {
        Library library = new Library();
        addthreebooks(library);
        int oldsize = library.getBooks().size();
        library.deleteBookByTitle("Titol2");
        assertTrue(library.getBooks().size() == oldsize - 1);
    }

    @Test
    public void alphabeticTest()
    {
        Library library = new Library();
        addthreebooks(library);
        List<Book> original = new ArrayList<>(library.getBooks());
        List<Book> ordered = library.getBooksOrderedByTitle();
        //We check that the list is ordered correctly
        boolean sal = false;
        boolean correct = true;
        int cont = 0;
        while(!sal)
        {
            if(cont<ordered.size()-1)
            {
                if(ordered.get(cont+1).getName().compareTo(ordered.get(cont).getName())<=0)
                {
                    correct= false;
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
        boolean modified = false;
        sal = false;
        cont=0;
        while(!sal)
        {
           if(cont<original.size())
           {
               if(original.get(cont).equals(library.getBooks().get(cont)))
               {
                   cont++;
               }
               else
               {
                   sal = true;
                   modified = true;
               }
           }
           else
           {
               sal = true;
           }
        }
        assertTrue(correct && !modified);
    }

    @Test
    public void notAllowDuplicates()
    {
        Library library = new Library();
        addthreebooks(library);
        //I add a repeted book
        library.addBook(new Book("Titol2","Descripcio2"));

        //I check the book was added two times
        int cont =0;
        for(Book book:library.getBooks())
        {
            if(book.getName().equals("Titol2"))
            {
                cont++;
            }
        }
        assertTrue(cont==1);
    }
}
