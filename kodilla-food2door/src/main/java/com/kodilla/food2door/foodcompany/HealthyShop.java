package com.kodilla.food2door.foodcompany;


import com.kodilla.food2door.order.Order;

import java.util.Map;
import java.util.Random;

public class HealthyShop extends FoodProducer {

    public HealthyShop(String name, Map<String, Integer> products) {
        super(name, products);
    }

    @Override
    public void process(Order order) {
        if (!order.getOrderProducts().isEmpty()) {
            Random random = new Random();
            System.out.println("Order sent " + random.nextInt(10) + " :");
            order.showProductsOrders();
        } else {
            System.out.println("Order not sent");
        }

    }


}
