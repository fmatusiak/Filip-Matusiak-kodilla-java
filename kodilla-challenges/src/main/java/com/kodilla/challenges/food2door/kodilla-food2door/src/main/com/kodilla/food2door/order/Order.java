package com.kodilla.food2door.order;

import java.util.Map;

public class Order {

    private Map<String, Integer> orderProducts;

    public Order(Map<String, Integer> orderProducts) {
        this.orderProducts = orderProducts;
    }

    public void showProductsOrders() {
        for (Map.Entry products : orderProducts.entrySet()) {
            System.out.println("Name: " + products.getKey() + " , Values: " + products.getValue());
        }
    }

    public Map<String, Integer> getOrderProducts() {
        return orderProducts;
    }

}
