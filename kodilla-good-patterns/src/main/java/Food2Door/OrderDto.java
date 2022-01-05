package Food2Door;

public class OrderDto {

    Customer customer;
    Product product;
    public int quantity;
    Supplier supplier;
    public boolean isSold;

    public OrderDto(Customer customer, Product product, int quantity, Supplier supplier, boolean isSold) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.supplier = supplier;
        this.isSold = isSold;
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

    public boolean isSold() {
        return isSold;
    }
}
