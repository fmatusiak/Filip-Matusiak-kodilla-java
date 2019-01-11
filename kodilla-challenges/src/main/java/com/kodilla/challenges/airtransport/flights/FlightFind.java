package com.kodilla.challenges.airtransport.flights;

import com.kodilla.challenges.airtransport.city.City;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFind {

    public void findFlightsFromCity(FlightList flightList, City fromCity) {

        List<Flight> flightsFromCityList = new ArrayList<>();

        for (Flight flight : flightList.getFlightsList()) {
            flightsFromCityList = flightList.getFlightsList().stream().filter(flight1 -> flight1.getFromCity().equals(fromCity)).collect(Collectors.toList());
        }

        for (Flight flight : flightsFromCityList) {
            System.out.println(flight.getFromCity().getCityName() + " --> " + flight.getToCity().getCityName());
        }
    }

    public void findFlightsToCity(FlightList flightList, City toCity) {

        List<Flight> flightsToCityList = new ArrayList<>();

        for (Flight flight : flightList.getFlightsList()) {
            flightsToCityList = flightList.getFlightsList().stream().filter(flight1 -> flight1.getToCity().equals(toCity)).collect(Collectors.toList());
        }

        for (Flight flight : flightsToCityList) {
            System.out.println(flight.getFromCity().getCityName() + " --> " + flight.getToCity().getCityName());
        }
    }

    public void findFlightsWithInterChange(FlightList flightList, City toCity) {
        
    }


}
