package com.kodilla.challenges.food2door.order;

import com.kodilla.challenges.food2door.foodcompany.FoodProducer;

import java.util.HashMap;
import java.util.Map;

public class OrderService {

    private Map<String, Integer> orderProducts;

    public Order createOrder(Map<String, Integer> listOrderProducts, FoodProducer foodProducer) {

        if (!checkOrder(listOrderProducts, foodProducer).isEmpty()) {
            return new Order(listOrderProducts);
        }

        Map<String, Integer> emptyOrder = new HashMap<>();

        return new Order(emptyOrder);
    }

    private Map<String, Integer> checkOrder(Map<String, Integer> listOrderProducts, FoodProducer foodProducer) {

        Map<String, Integer> listRemoveProducts = new HashMap<>();

        for (Map.Entry<String, Integer> orderProduct : listOrderProducts.entrySet()) {
            if (foodProducer.getProducts().containsKey(orderProduct.getKey()) && foodProducer.getProducts().containsValue(orderProduct.getValue())) {
                listRemoveProducts.put(orderProduct.getKey(), orderProduct.getValue());
            } else {
                System.out.println("Not product: " + orderProduct.getKey() + " - " + orderProduct.getValue() + " " + " in " + foodProducer.getName());
            }
        }

        return listRemoveProducts;
    }
}
