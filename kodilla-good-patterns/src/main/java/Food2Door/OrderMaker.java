package Food2Door;


public class OrderMaker {

    private OrderProcessor orderProcessor;

    public OrderMaker(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public void makeOrder() {
        System.out.println("Starting the ordering process...");
        System.out.println("Your order has been placed.");
        this.orderProcessor.process();
    }
}