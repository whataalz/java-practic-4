
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "Джордж Оруэлл", 328, true));
        library.addBook(new Book("Скотный двор", "Джордж Оруэлл", 120, false));
        library.addBook(new Book("Хоббит", "Дж. Р. Р. Толкин", 300, true));
        library.addBook(new Book("Властелин Колец", "Дж. Р. Р. Толкин", 1200, false));
        library.addBook(new Book("Фаренгейт 451", "Рэй Брэдбери", 250, false));
        System.out.println("Общее количество страниц в библиотеке: " + library.getTotalPages());
        String searchAuthor = "Джордж Оруэлл";
        System.out.println("Книги автора " + searchAuthor + ":");
        List<Book> orwellBooks = library.findByAuthor(searchAuthor);
        for (Book b : orwellBooks) {
            System.out.println(b.describe());
        }
        System.out.println("Непрочитанные книги:");
        List<Book> unreadBooks = library.getUnreadBooks();
        for (Book b : unreadBooks) {
            System.out.println(b.describe());
        }
    }
}

class Library {
    private List<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public int getTotalPages() {
        int total = 0;
        for (Book book : books) {
            total += book.getPages();
        }
        return total;
    }
    public List<Book> getUnreadBooks() {
        List<Book> unread = new ArrayList<>();
        for (Book book : books) {
            if (!book.isRead()) {
                unread.add(book);
            }
        }
        return unread;
    }
}
