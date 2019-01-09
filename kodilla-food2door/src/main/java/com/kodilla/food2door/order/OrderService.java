package com.kodilla.food2door.order;

import com.kodilla.food2door.foodcompany.FoodProducer;

import java.util.HashMap;
import java.util.Map;

public class OrderService {

    private Map<String, Integer> orderProducts;

    public Order makeOrder(FoodProducer foodProducer) {
        orderProducts = new HashMap<>(foodProducer.getProducts());

        if (checkOrder(foodProducer.getProducts(), orderProducts)) {
            return new Order(orderProducts);
        }

        Map<String, Integer> emptyOrder = new HashMap<>();

        return new Order(emptyOrder);
    }

    private boolean checkOrder(Map<String, Integer> listFoodProducerProducts, Map<String, Integer> listOrderProducts) {
        if (listOrderProducts.equals(listFoodProducerProducts)) {
            return true;
        }
        return false;
    }
}
