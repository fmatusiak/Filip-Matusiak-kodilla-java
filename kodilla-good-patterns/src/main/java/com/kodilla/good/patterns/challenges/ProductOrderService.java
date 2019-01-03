package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProductOrderService {

    private ArrayList<ProductOrder> productOrders = new ArrayList<>();

    public boolean createNewOrderProduct(User user, Product product, Location location, LocalDate localDate) {
        return productOrders.add(new ProductOrder(user, product, location, localDate));
    }

    public ArrayList<ProductOrder> getProductOrders() {
        return productOrders;
    }
}
