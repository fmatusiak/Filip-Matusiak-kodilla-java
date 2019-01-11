package com.kodilla.challenges.airtransport.flights;

import com.kodilla.challenges.airtransport.city.City;

public class Flight {

    private City fromCity;
    private City toCity;

    public Flight(City fromCity, City toCity) {
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public City getToCity() {
        return toCity;
    }

    public City getFromCity() {
        return fromCity;
    }
}
