package com.kodilla.stream.world;

import java.util.ArrayList;

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
