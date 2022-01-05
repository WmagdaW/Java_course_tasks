package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {
    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final OrderService orderService,
                                 final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isSold = orderService.sell(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getQuantity(), orderRequest.getOrderDate());

        if (isSold) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getQuantity(), orderRequest.getOrderDate());
            System.out.println("Your order has been accepted.");
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getQuantity(), orderRequest.getOrderDate(), true);
        } else {
            System.out.println("Your order has been rejected.");
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getQuantity(), orderRequest.getOrderDate(), false);
        }
    }
}


