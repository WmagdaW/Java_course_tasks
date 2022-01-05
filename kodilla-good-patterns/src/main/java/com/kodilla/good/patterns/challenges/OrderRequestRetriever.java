package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John Smith");
        Product product = new Product("Book", 30.5);
        int quantity = 1;
        LocalDateTime orderDate = LocalDateTime.of(2021, 12, 27, 12, 0);

        return new OrderRequest(user, product, quantity, orderDate);
    }
}

