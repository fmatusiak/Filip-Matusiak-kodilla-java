package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public final class World {
    private ArrayList<Continent> continents = new ArrayList<>();

    public ArrayList<Continent> getContinents() {
        return continents;
    }

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public void addContinentList(ArrayList<Continent> continent){
        this.continents = continent;
    }

    public BigDecimal getPeopleQuantity() {
        return getContinents().stream().flatMap(continent -> continent.getCountryList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, temporary) -> sum = sum.add(temporary));
    }
}
