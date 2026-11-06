
public class Task1 {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "Джордж Оруэлл", 328, true);
        Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский", 600, false);
        Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков", 480, true);
        System.out.println(book1.describe());
        System.out.println(book2.describe());
        System.out.println(book3.describe());
    }
}

class Book {
    private String title;
    private String author;
    private int pages;
    private boolean isRead;
    public Book(String title, String author, int pages, boolean isRead) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isRead = isRead;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }
    public boolean isRead() {
        return isRead;
    }
    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }
    public String describe() {
        return "Книга: " + title + " автор " + author + ", " + pages + " стр., прочитана: " + isRead;
    }
}
