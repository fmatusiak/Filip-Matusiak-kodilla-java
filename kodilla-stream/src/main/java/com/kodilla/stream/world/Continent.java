package com.kodilla.stream.world;

import java.util.ArrayList;

public final class Continent {

    private ArrayList<Country> asia  = new ArrayList<>();
    private ArrayList<Country> africa  = new ArrayList<>();
    private ArrayList<Country> europe  = new ArrayList<>();

    public Continent(){
        asia.add(new Country("Armenia"));
        asia.add(new Country("China"));

        africa.add(new Country("Algeria"));
        africa.add(new Country("Angola"));

        europe.add(new Country("Italy"));
        europe.add(new Country("Belgium"));
    }

    public ArrayList<Country> getAsia() {
        return asia;
    }

    public ArrayList<Country> getAfrica() {
        return africa;
    }

    public ArrayList<Country> getEurope() {
        return europe;
    }

    public ArrayList<Country> getAllCountry(){
        ArrayList<Country> allCountry = new ArrayList<>();

        for(Country country : getEurope()){
            allCountry.add(country);
        }

        for(Country country : getAsia()){
            allCountry.add(country);
        }

        for(Country country : getAfrica()){
            allCountry.add(country);
        }

        return allCountry;
    }

}
