package Food2Door;

public class OrderServiceProcessor {

    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderServiceProcessor(OrderService orderService, OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto processOrder(final OrderRequest orderRequest) {

        boolean isSold = orderService.sell(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getSupplier());

        if (isSold) {
            orderRepository.createOrder(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getQuantity());
            System.out.println("The ordering process was successful.");
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getSupplier(), true);
        } else {
            System.out.println("The ordering process failed.");
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getSupplier(), false);
        }
    }
}
