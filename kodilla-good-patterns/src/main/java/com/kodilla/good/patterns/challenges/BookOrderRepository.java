package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BookOrderRepository implements OrderRepository {
    public boolean createOrder(User user, Product product, int quantity, LocalDateTime orderDate) {
        return true;
    }
}
