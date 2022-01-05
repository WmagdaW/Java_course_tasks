package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

    public boolean sell(User user, Product product, int quantity, LocalDateTime orderDate);
}
