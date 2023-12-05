import java.util.*;
public class Reader {
    private String name;
    private List<Book> borrowedBooks;

    public Reader(String name)
    {
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(String title, Library library)
    {
        List<Book> books = library.getBooks();
        for(int i = 0; i < books.size(); i++)
        {
            if( title == books.get(i).getTitle())
            {

                borrowedBooks.add(books.get(i));
                library.removeBook(i);
            }

        }
    }

    public void removeBook(Book book)
    {
        borrowedBooks.remove(book);
    }

    public void info()
    {
        System.out.print("Borrowed books: ");
        for(int i = 0; i < borrowedBooks.size(); i++)
        {
            System.out.print(borrowedBooks.get(i).getTitle() + " " );
        }
        System.out.println();

    }

}
