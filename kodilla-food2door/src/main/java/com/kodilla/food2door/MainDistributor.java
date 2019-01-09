package com.kodilla.food2door;

import com.kodilla.food2door.foodcompany.ExtraFoodShop;
import com.kodilla.food2door.foodcompany.FoodProducer;
import com.kodilla.food2door.foodcompany.GlutenFreeShop;
import com.kodilla.food2door.foodcompany.HealthyShop;
import com.kodilla.food2door.order.Order;
import com.kodilla.food2door.order.OrderService;

import java.util.HashMap;
import java.util.Map;

public class MainDistributor {
    public static void main(String[] args){

        Map<String, Integer> productsList = new HashMap<>();

        productsList.put("Vegetables",10);
        productsList.put("Meat" , 20);
        productsList.put("Fruit", 30);

        FoodProducer extraFoodShop = new ExtraFoodShop("ExtraFoodShop",productsList);
        FoodProducer healthyShop = new HealthyShop("Healthy", productsList);
        FoodProducer glutenFreeShop = new GlutenFreeShop("GlutenFreeShop", productsList);

        OrderService orderService = new OrderService();

        Order extraFoodShopOrder = orderService.makeOrder(extraFoodShop);
        extraFoodShop.process(extraFoodShopOrder);

        Order healthyShopOrder = orderService.makeOrder(healthyShop);
        healthyShop.process(healthyShopOrder);

        Order glutenFreeShopOrder = orderService.makeOrder(glutenFreeShop);
        glutenFreeShop.process(glutenFreeShopOrder);



    }
}
