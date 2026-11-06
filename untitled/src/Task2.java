
public class Task2 {
    public static void main(String[] args) {

        Book b1 = new Book("О дивный новый мир", "Олдос Хаксли", 350, false);
        Book b2 = new Book("Дюна", "Фрэнк Герберт", 700, false);
        Book b3 = new Book("Автостопом по галактике", "Дуглас Адамс", 250, false);
        Reader reader1 = new Reader("Алексей", "Фантастика");
        Reader reader2 = new Reader("Мария", "Антиутопия");
        System.out.println(reader1.getName() + " -> " + reader1.getLastBookInfo());
        reader1.readBook(b2);
        reader2.readBook(b1);
        System.out.println(reader1.getName() + " последняя книга: " + reader1.getLastBookInfo());
        System.out.println(reader2.getName() + " последняя книга: " + reader2.getLastBookInfo());
    }
}

class Reader {
    private String name;
    private String favoriteGenre;
    private Book lastBook;
    public Reader(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }
    public String getName() {
        return name;
    }
    public void readBook(Book book) {
        this.lastBook = book;
        book.setRead(true);
    }
    public String getLastBookInfo() {
        if (lastBook == null) {
            return "Пока ничего не читал";
        } else {
            return lastBook.describe();
        }
    }
}
