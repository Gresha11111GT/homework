package hw.hw17;

import java.util.ArrayList;
import java.util.Objects;


public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, int publicationYear, int isbn) throws DuplicateBookException, InvalidYearException {
        try {
            for (Book book : books) {
                if (book.getIsbn() == isbn) {
                    throw new DuplicateBookException("Книга з таким ISBN вже існує в бібліотеці");
                }
            }

            if (publicationYear < 0 || publicationYear > 2024) {
                throw new InvalidYearException("Недопустимий рік видання");
            }

            books.add(new Book(title, author, publicationYear, isbn));
            System.out.println("Книга додана до бібліотеки: " + title);
        } catch (DuplicateBookException | InvalidYearException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }


    public void removeBook(int isbn) throws BookNotFoundException {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.isbn == isbn) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed by isbn: " + isbn);
        } else {
            throw new BookNotFoundException("Такої книги не існує");
        }
    }



    public void printBooks() {
        for (Book book : books) {
            book.print();
        }
    }

    public void findBookByIsbn(int isbn) throws BookNotFoundException {
        Book bok = null;
        try{
            for (Book book : books) {
                if (book.getIsbn() == isbn) {
                    bok = book;
                }
            }
            if(bok == null)
                throw new BookNotFoundException("Такої книги не існує");
            else
                bok.print();
        }
        catch (BookNotFoundException e){
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    public void findBooksByAuthor(String author) throws BookNotFoundException{
        Book bok = null;
        try{
            for (Book book : books) {
                if (Objects.equals(book.getAuthor(), author)) {
                    bok = book;
                }
            }
            if(bok == null)
                throw new BookNotFoundException("Такої книги не існує");
            else
                bok.print();
        }
        catch (BookNotFoundException e){
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    public void findBooksByYear(int year) throws BookNotFoundException{
        Book bok = null;
        try{
            for (Book book : books) {
                if (book.getPublicationYear() == year) {
                    bok = book;
                }
            }
            if(bok == null)
                throw new BookNotFoundException("Такої книги не існує");
            else
                bok.print();
        }
        catch (BookNotFoundException e){
            System.out.println("Помилка: " + e.getMessage());
        }
    }
    public static class DuplicateBookException extends Exception {
        public DuplicateBookException(String message) {
            super(message);
        }
    }

    public static class InvalidYearException extends Exception {
        public InvalidYearException(String message) {
            super(message);
        }
    }
    public static class BookNotFoundException extends Exception {
        public BookNotFoundException(String message) {
            super(message);
        }
    }
}
