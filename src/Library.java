import java.util.*;

public class Library {

    private List <Book> books;

    public Library()
    {
        books = new ArrayList<>();
    }

    public void addNewBook(Book newBook)
    {
        books.add(newBook);
    }

    public void removeBook(int i)
    {
        books.remove(i);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void info()
    {
        System.out.print("Books in the library: ");

        for(int i = 0; i < books.size(); i++)
        {
            System.out.print(books.get(i).getTitle() + " ");
        }
        System.out.println();

    }
}
