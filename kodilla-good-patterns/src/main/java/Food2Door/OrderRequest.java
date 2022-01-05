package Food2Door;

public class OrderRequest {

    Customer customer;
    Product product;
    public int quantity;
    Supplier supplier;

    public OrderRequest(Customer customer, Product product, int quantity, Supplier supplier) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
