package hw.hw11.hw11_1;

public class main {
    public static void main(String[] args) {
        Library literature = new Library();
        literature.addBook("California hotel", "Gresha_11111_GT", 2160);
        literature.addBook("Sherif Burgers", "Gresha_11111_GT", 3165);
        literature.addBook("Apex", "EA", 14);
        literature.printBooks();
        literature.removeBook("Sherif Burgers", "Posya");
        System.out.println(" ");
        literature.printBooks();
        literature.searchByAuthor("jlkwqj4jhrlkiuw4tiu4");
        literature.searchByAuthor("EA");
        Library.count();
    }
}