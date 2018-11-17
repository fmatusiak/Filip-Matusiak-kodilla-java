package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public final class World {
    ArrayList<Country> world = new ArrayList<>();

    public World(){
        Continent continent = new Continent();

        for(Country africa : continent.getAfrica()){
            world.add(africa);
        }

        for(Country asia : continent.getAsia()){
            world.add(asia);
        }

        for(Country europe : continent.getEurope()){
            world.add(europe);
        }

    }

    public ArrayList<Country> getWorld() {
        return world;
    }

    public void getPeopleQuantity(){

    }
}
