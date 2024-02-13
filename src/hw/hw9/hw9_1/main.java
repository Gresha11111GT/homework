package hw.hw9.hw9_1;

public class main {
    public static void main(String[] args) {
        Library literature = new Library();
        literature.addBook("California hotel", "Gresha_11111_GT", 2160);
        literature.addBook("Sherif Burgers", "Posya", 3165);
        literature.addBook("Apex", "EA", 14);
        literature.printBooks();
        literature.removeBook("Sherif Burgers", "Posya");
        System.out.println(" ");
        literature.printBooks();
    }
}
