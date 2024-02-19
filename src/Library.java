import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(int index) {
        books.remove(index);
    }

    public List<Book> searchBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().contains(title))
                .collect(Collectors.toList());
    }

    public List<Book> searchBookByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().contains(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchBookByGenre(String genre) {
        return books.stream()
                .filter(book -> book.getGenre().contains(genre))
                .collect(Collectors.toList());
    }

    public void displayBooksByTitle() {
        books.stream()
                .sorted((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()))
                .forEach(book -> System.out.println(book));
    }

    public void displayBooksByAuthor() {
        books.stream()
                .sorted((b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()))
                .forEach(book -> System.out.println(book));
    }

    public void displayBooksByYear() {
        books.stream()
                .sorted((b1, b2) -> b1.getPublicationYear() - b2.getPublicationYear())
                .forEach(book -> System.out.println(book));
    }

    public int calculateYearAvg() {
        int yearSum = books.stream()
                .map(book -> book.getPublicationYear())
                .reduce(0, (a, b) -> a + b);
        return yearSum / books.size();
    }

    public int getBookCount() {
        return books.size();
    }
}
