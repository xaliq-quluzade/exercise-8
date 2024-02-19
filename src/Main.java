import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("atitle0", "cauthor0", "genre0", 2012));
        lib.addBook(new Book("ctitle1", "xauthor1", "genre1", 2013));
        lib.addBook(new Book("ttitle10", "zauthor10", "genre10", 2014));
        lib.addBook(new Book("atitle11", "wauthor11", "genre11", 2015));
        lib.addBook(new Book("stitle100", "aauthor100", "genre100", 2016));
        lib.addBook(new Book("etitle101", "cauthor101", "genre101", 2002));

        // lib.removeBook(1);

        List<Book> listSearchTitle = lib.searchBookByTitle("title1");
        List<Book> listSearchAuthor = lib.searchBookByAuthor("author0");
        List<Book> listSearchGenre = lib.searchBookByGenre("genre10");

        // lib.displayBooksByTitle();
        // lib.displayBooksByAuthor();
        // lib.displayBooksByYear();

        // System.out.println(lib.calculateYearAvg());

        // System.out.println(lib.getBookCount());
    }
}