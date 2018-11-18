package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private ArrayList<Country> countryList = new ArrayList<>();

    public Continent() {

    }

    public Continent(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

}
