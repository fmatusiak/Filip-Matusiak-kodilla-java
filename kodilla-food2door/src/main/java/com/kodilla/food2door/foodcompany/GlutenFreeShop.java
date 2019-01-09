package com.kodilla.food2door.foodcompany;

import com.kodilla.food2door.order.Order;

import java.util.Map;

public class GlutenFreeShop extends FoodProducer {

    public GlutenFreeShop(String name, Map<String, Integer> products) {
        super(name, products);
    }

    @Override
    public void process(Order order) {

        if (!order.getOrderProducts().isEmpty()) {
            System.out.println("Order sent: ");
            order.showProductsOrders();
        } else {
            System.out.println("Order not sent");
        }

    }
}