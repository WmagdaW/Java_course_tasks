package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderDto {

    private User user;
    private Product product;
    private int quantity;
    private LocalDateTime orderDate;
    public boolean isSold;

    public OrderDto(User user, Product product, int quantity, LocalDateTime orderDate, boolean isSold) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public boolean isSold() {
        return isSold;
    }
}

