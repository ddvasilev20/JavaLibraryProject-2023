import java.util.*;
public class BookProcessor extends Thread{
    private Book book;

    public BookProcessor(Book book)
    {
        this.book = book;
    }

    @Override
    public void run(){
        this.book.info();
    }
}
