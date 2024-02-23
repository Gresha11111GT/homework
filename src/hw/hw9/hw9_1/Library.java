package hw.hw9.hw9_1;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    Book[] books;


    public Library(){
        books = new Book[0];

    }

    public void addBook(String title, String author, int publicationYear){
        books = Arrays.copyOf(books, books.length+1);
        books[books.length-1] = new Book(title, author, publicationYear);
    }
    public void removeBook(String title, String author){
        int index = 0;
        Book[] removeBooks = new Book[books.length-1];
        for (int i = 0; i < books.length; i++) {
            if (!(Objects.equals(books[i].title, title) && Objects.equals(books[i].author, author))){
                removeBooks[index] = books[i];
                index++;
            }
        }
        books = removeBooks;
        System.out.println("Book removed: "+title+author);
    }
    public void printBooks(){
        for (int i = 0; i < books.length; i++) {
            System.out.println("title: "+ books[i].title +"; author: "+ books[i].author +"; publication year "+ books[i].publicationYear +";");
        }
    }
}