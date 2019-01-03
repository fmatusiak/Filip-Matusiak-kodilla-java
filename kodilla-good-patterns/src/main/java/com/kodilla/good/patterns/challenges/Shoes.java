package com.kodilla.good.patterns.challenges;

public class Shoes implements Product {

    private String shoesName;
    private String shoesType;
    private String shoesSize;

    public Shoes(String shoesName, String shoesType, String shoesSize) {
        this.shoesName = shoesName;
        this.shoesType = shoesType;
        this.shoesSize = shoesSize;
    }

    @Override
    public String getProductName() {
        return shoesName;
    }

    @Override
    public String getProductType() {
        return shoesType;
    }

    public String getShoesSize() {
        return shoesSize;
    }
}
