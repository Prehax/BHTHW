import java.util.*;

public class HW0421 {
    public static void main(String[] args) {
        BookSeller.sellBooks();
        BookSeller.printAll();
    }
}

// Topic Static
class Book {
    private String id;
    private String isbn;
    private String name;
    private String author;
    public static Date date;
    static {
        date = new Date();
    }
    public Book (String id, String isbn, String name, String author) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{ " +
                "id='" + id + '\'' +
                ", isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                " }";
    }

}

class BookSeller {
    private static List<Book> books = new ArrayList<>();
    public static void sellBooks() {
        books.add(new Book("001", "abc78ca", "Book1", "Amy"));
        books.add(new Book("002", "abdsgga", "Book2", "Bob"));
        books.add(new Book("003", "23dgs3a", "Book3", "Carl"));
        books.add(new Book("004", "8df83yh", "Book4", "Dylan"));
    }

    public static void printAll() {
        for (Book book: books) {
            System.out.println(book);
        }
    }
}