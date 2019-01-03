package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderProcess {

    ProductOrderService productOrderService = new ProductOrderService();

    public void orderProduct(User user, Product product, Location location, LocalDate localDate) {
        if (productOrderService.createNewOrderProduct(user, product, location, localDate)) {
            System.out.println("Orders accepted");
            showAllOrders();
        } else {
            System.out.println("Orders not accepted");
        }
    }

    public void showAllOrders() {
        for (ProductOrder productOrder : productOrderService.getProductOrders()) {
            System.out.println(productOrder.getUser().getUserId() + " - "
                    + productOrder.getProduct().getProductName() + " - "
                    + productOrder.getProduct().getProductType() + " - "
                    + productOrder.getLocation().getFromPlace() + " - "
                    + productOrder.getLocation().getToPlace() + " - "
                    + productOrder.getLocalDate() + "/n");
        }
    }

}
