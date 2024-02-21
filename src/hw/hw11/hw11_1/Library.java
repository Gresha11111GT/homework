package hw.hw11.hw11_1;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    static Book[] books;


    public Library(){
        books = new Book[0];

    }
    static boolean n = true;

    public void addBook(String title, String author, int publicationYear){
        books = Arrays.copyOf(books, books.length+1);
        books[books.length-1] = new Book(title, author, publicationYear);
    }
    public void removeBook(String title, String author){
        int index = 0;
        Book[] removeBooks = new Book[books.length-1];
        for (int i = 0; i < books.length; i++) {
            if (!Objects.equals(books[i].getTitle(), title) && !Objects.equals(books[i].getAuthor(), author)){
                removeBooks[index] = books[i];
                index++;
            }
        }
        books = removeBooks;
        System.out.println("Book removed: "+title+author);
    }
    public void printBooks(){
        for (int i = 0; i < books.length; i++) {
            System.out.println("title: "+ books[i].getTitle() +"; author: "+ books[i].getAuthor() +"; publication year "+ books[i].getPublicationYear() +";");
        }
    }
    public void searchByAuthor(String author){
        boolean name = false;
        for (int i = 0; i < books.length; i++) {
            if (Objects.equals(books[i].getAuthor(), author)){
                System.out.println("title: "+ books[i].getTitle() +"; author: "+ books[i].getAuthor() +"; publication year "+ books[i].getPublicationYear());
                name=true;
            }
        }
        if (!name){
            System.out.println("Не знайдено жодної книги");
        }
    }
    public static void count(){
        if (books==null)
            System.out.println("Книги роздали, бібліотека зачинена");
        else
            System.out.println("Зараз у бібліотеці книг: "+books.length);
    }
}