package Food2Door;

public class Food2Door {
    public static void main(String[] args) {
        OrderProcessor extraFoodShop = new ExtraFoodShop();
        OrderProcessor glutenFreeShop = new GlutenFreeShop();
        OrderProcessor healthyShop = new HealthyShop();
        OrderMaker orderMaker1 = new OrderMaker(extraFoodShop);
        OrderMaker orderMaker2 = new OrderMaker(glutenFreeShop);
        OrderMaker orderMaker3 = new OrderMaker(healthyShop);

        OrderRetriever orderRequestRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderServiceProcessor orderServiceProcessor = new OrderServiceProcessor(new FoodOrderService(), new FoodOrderRepository());

        orderMaker1.makeOrder();
        orderServiceProcessor.processOrder(orderRequest);

        orderMaker2.makeOrder();
        orderMaker3.makeOrder();

    }
}
