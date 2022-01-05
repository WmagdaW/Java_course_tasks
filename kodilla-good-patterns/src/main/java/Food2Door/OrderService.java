package Food2Door;


public interface OrderService {

    boolean sell(Customer customer, Product product, int quantity, Supplier supplier);

}
