package com.kodilla.challenges.food2door.foodcompany;

import com.kodilla.challenges.food2door.order.Order;

import java.time.LocalDate;
import java.util.Map;

public class ExtraFoodShop extends FoodProducer {

    public ExtraFoodShop(String name, Map<String, Integer> products) {
        super(name, products);
    }

    @Override
    public void process(Order order) {

        if (!order.getOrderProducts().isEmpty()) {
            System.out.println("Order sent ");
            order.showProductsOrders();
            System.out.println(getDate());

        } else {
            System.out.println("Order not sent");
        }

    }

    public LocalDate getDate() {
        return LocalDate.now();
    }

}
