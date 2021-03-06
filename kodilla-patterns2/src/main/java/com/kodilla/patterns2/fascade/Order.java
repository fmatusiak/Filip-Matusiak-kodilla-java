package com.kodilla.patterns2.fascade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Item> items = new ArrayList<>();
    private final Long orderId;
    private final Long userId;
    private ProductService productService;
    private boolean isPaid = false;
    private boolean isVerifed = false;
    private boolean isSubmitted = false;

    public Order(ProductService productService, Long orderId, Long userId) {
        this.productService = productService;
        this.orderId = orderId;
        this.userId = userId;
    }

    public BigDecimal calcualateValue() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item : items) {
            sum = sum.add(productService.getPrice(item.getProductId())).multiply(new BigDecimal(item.getQty()));
        }
        return sum;
    }

    public ProductService getProductService() {
        return productService;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isVerifed() {
        return isVerifed;
    }

    public void setVerifed(boolean verifed) {
        isVerifed = verifed;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }
}