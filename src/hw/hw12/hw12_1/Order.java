package hw.hw12.hw12_1;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private final List<Product> ProductList;
    private String client;
    private String orderAddress;
    private String payStatus;

    public Order(String client, String orderAddress, String payStatus) {
        this.ProductList = new ArrayList<>();
        this.client = client;
        this.orderAddress = orderAddress;
        this.payStatus = payStatus;
    }

    public void addProduct(Product product) {
        ProductList.add(product);
    }

    public void delProduct(Product product) {
        ProductList.remove(product);
    }
    public void changePayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
    public List<Product> getProductList() {
        return ProductList;
    }
    public String getClient() {
        return client;
    }
    public void setClient(String client) {
        this.client = client;
    }
    public String getOrderAddress() {
        return orderAddress;
    }
    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }
    public String getPayStatus() {
        return payStatus;
    }
}