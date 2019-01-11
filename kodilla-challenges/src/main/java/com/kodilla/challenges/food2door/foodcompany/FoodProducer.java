package com.kodilla.challenges.food2door.foodcompany;

import com.kodilla.challenges.food2door.order.Order;

import java.util.Map;

public abstract class FoodProducer {

    protected String name;
    protected Map<String, Integer> products;

    public FoodProducer(String name, Map<String, Integer> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public abstract void process(Order order);

}
