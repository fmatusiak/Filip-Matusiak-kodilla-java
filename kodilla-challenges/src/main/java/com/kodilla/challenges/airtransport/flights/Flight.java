package com.kodilla.challenges.airtransport.flights;

import com.kodilla.challenges.airtransport.city.City;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(fromCity, flight.fromCity) &&
                Objects.equals(toCity, flight.toCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromCity, toCity);
    }
}
