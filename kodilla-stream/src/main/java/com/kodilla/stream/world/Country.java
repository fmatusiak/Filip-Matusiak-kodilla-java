package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private String countryName;
    private BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
