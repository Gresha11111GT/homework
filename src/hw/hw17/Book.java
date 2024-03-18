package hw.hw17;

public class Book {
    String title;

    String author;

    int publicationYear;

    int isbn;
    public Book(String title, String author, int publicationYear, int isbn){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
    }
    public void print(){
        System.out.println("Автор - "+ this.author+", назва - "+ this.title +", рік видання - "+ this.publicationYear+", ісбн - "+ this.isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
