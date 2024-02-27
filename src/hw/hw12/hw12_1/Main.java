package hw.hw12.hw12_1;

public class Main {
    public static void main(String[] args) {
        Product TShort = new Wearing("TShort", 200, 1);
        Product Iron = new Electronics("Iron", 500, 1);
        Product Vine = new Alcohol("Italian_vine_1873", 800, 1);
        Order order = new Order("Люцифер", "666А", "карткою");
        order.addProduct(TShort);
        order.addProduct(Iron);
        order.delProduct(Vine);
    }
}