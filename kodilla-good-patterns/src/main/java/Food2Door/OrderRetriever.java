package Food2Door;


public class OrderRetriever {

    public OrderRequest retrieve() {
        Customer customer1 = new Customer("John Smith");
        Product product1 = new Product(111);
        Supplier supplier1 = new Supplier("ExtraFoodShop");
        int quantity = 5;
        OrderRequest orderRequest1 = new OrderRequest(customer1, product1, quantity, supplier1);

        return orderRequest1;
    }
}
