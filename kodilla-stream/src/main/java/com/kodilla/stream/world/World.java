package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public final class World {
    private ArrayList<Continent> world = new ArrayList<>();

    public World() {
        Continent continent = new Continent();
        world.add(continent);
    }

    public ArrayList<Continent> getWorld() {
        return world;
    }

    public BigDecimal getPeopleQuantity() {
        return getWorld().stream().flatMap(continent -> continent.getAllCountry().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, temporary) -> sum = sum.add(temporary));
    }
}
