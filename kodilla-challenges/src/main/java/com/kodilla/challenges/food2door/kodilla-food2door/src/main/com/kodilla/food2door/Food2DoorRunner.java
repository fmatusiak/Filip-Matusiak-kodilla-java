package com.kodilla.food2door;

import com.kodilla.food2door.order.Order;
import com.kodilla.food2door.order.OrderService;
import foodcompany.ExtraFoodShop;
import foodcompany.FoodProducer;
import foodcompany.GlutenFreeShop;
import foodcompany.HealthyShop;

import java.util.HashMap;
import java.util.Map;

public class Food2DoorRunner {
    public static void main(String[] args) {

        Map<String, Integer> listProducts = new HashMap<>();
        listProducts.put("Fruit", 10);
        listProducts.put("Meat", 20);

        FoodProducer extraFoodShop = new ExtraFoodShop("extraFoodShop", listProducts);
        FoodProducer healthyShop = new HealthyShop("healthyShop", listProducts);
        FoodProducer glutenFreeShop = new GlutenFreeShop("glutenFreeShop", listProducts);

        Map<String, Integer> listOrderProducts = new HashMap<>();
        listOrderProducts.put("Fruit", 10);
        listOrderProducts.put("Meat", 20);

        OrderService orderService = new OrderService();

        Order extraFoodShopOrder = orderService.createOrder(listOrderProducts, extraFoodShop);
        Order healthyShopOrder = orderService.createOrder(listOrderProducts, healthyShop);
        Order glutenFreeShopOrder = orderService.createOrder(listOrderProducts, glutenFreeShop);

        extraFoodShop.process(extraFoodShopOrder);
        healthyShop.process(healthyShopOrder);
        glutenFreeShop.process(glutenFreeShopOrder);


    }
}

