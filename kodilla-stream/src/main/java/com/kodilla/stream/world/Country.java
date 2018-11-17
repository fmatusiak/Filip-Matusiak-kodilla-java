package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public final class Country {
    private String countryName;

    public Country(String countryName){
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public  BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = new BigDecimal("1312323123213123123");
        return peopleQuantity;
    }
}
