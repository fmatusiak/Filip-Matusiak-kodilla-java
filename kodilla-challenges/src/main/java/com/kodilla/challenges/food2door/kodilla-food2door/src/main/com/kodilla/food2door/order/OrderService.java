package com.kodilla.food2door.order;

import foodcompany.FoodProducer;

import java.util.HashMap;
import java.util.Map;

public class OrderService {

    private Map<String, Integer> orderProducts;

    public Order createOrder(Map<String, Integer> listOrderProducts, FoodProducer foodProducer) {

        if (checkOrder(listOrderProducts, foodProducer)) {
            return new Order(listOrderProducts);
        }

        Map<String, Integer> emptyOrder = new HashMap<>();

        return new Order(emptyOrder);
    }

    private boolean checkOrder(Map<String, Integer> listOrderProducts, FoodProducer foodProducer) {
        return foodProducer.getProducts().equals(listOrderProducts);
    }
}
