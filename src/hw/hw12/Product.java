package hw.hw12;

public class Product {
    private String name;
    private int cost;
    private int count;

    public Product(String name, int cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
