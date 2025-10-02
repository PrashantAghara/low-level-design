package dp.iterator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(100, "Maths"),
                new Book(200, "Hindi"),
                new Book(300, "English"),
                new Book(400, "SS"),
                new Book(500, "Science")
        );
        Library library = new Library(books);
        Iterator iterator = library.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Name : " + book.getName());
            System.out.println("Price : " + book.getPrice());
        }
    }
}
