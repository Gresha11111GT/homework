package hw.hw17;

public class Main {
    public static void main(String[] args) throws Library.InvalidYearException, Library.DuplicateBookException, Library.BookNotFoundException {
        Library library = new Library();
        library.addBook("California hotel", "Gresha_11111_GT", 2023, 0);
        library.addBook("Sherif Burgers", "Posya", 3165, 1);
        library.addBook("Apex", "EA", 14, 2);
        library.findBookByIsbn(0);
        library.findBookByIsbn(10);
    }
}
