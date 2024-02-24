package hw.hw12;

public class Main {
    public static void main(String[] args) {
        Product vegetables = new Product("Tomato", 200, 10);
        Product meat = new Product("Chicken", 1000, 5);
        Product alcohol = new Product("Italian_vine_1873", 800, 1);
        Order order = new Order("Люцифер", "666А", "карткою");
        order.addProduct(alcohol);
        order.addProduct(meat);
        order.delProduct(alcohol);

    }
}