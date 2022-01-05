package Food2Door;


public interface OrderRepository {

    public boolean createOrder(Customer customer, Product product, int quantity);
}


