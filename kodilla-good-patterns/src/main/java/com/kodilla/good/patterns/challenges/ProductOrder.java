package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrder {

    private User user;
    private Product product;
    private Location location;
    private LocalDate localDate;

    public ProductOrder(User user, Product product, Location location, LocalDate localDate) {
        this.user = user;
        this.product = product;
        this.location = location;
        this.localDate = localDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Location getLocation() {
        return location;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

}
