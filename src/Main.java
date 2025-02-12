import java.util.*;
public class Main {
    public static void main(String[] arguments) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();
        Book book1 = new Book(title, author, year);
        BookProcessor bookTwo = new BookProcessor(book1);
        bookTwo.start();
        bookTwo.interrupt();
    }
}