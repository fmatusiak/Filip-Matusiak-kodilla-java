package com.kodilla.challenges.airtransport.flights;

import com.kodilla.challenges.airtransport.city.City;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFind {

    private FlightList flightList;

    public FlightFind(FlightList flightList) {
        this.flightList = flightList;
    }


    public void findFlightsFromCity(City fromCity) {

        List<Flight> flightsFromCityList = new ArrayList<>();

        flightsFromCityList = flightList.getFlightsList().stream().filter(flight1 -> flight1.getFromCity().equals(fromCity)).collect(Collectors.toList());

        for (Flight flight : flightsFromCityList) {
            System.out.println(flight.getFromCity().getCityName() + " --> " + flight.getToCity().getCityName());
        }
    }

    public void findFlightsToCity(City toCity) {

        List<Flight> flightsToCityList = new ArrayList<>();

        flightsToCityList = flightList.getFlightsList().stream().filter(flight1 -> flight1.getToCity().equals(toCity)).collect(Collectors.toList());

        for (Flight flight : flightsToCityList) {
            System.out.println(flight.getFromCity().getCityName() + " --> " + flight.getToCity().getCityName());
        }
    }

    public void findFlightsWithInterChange(City fromCity, City toCity) {

        List<Flight> flightsToCityList = new ArrayList<>();
        List<Flight> flightsInterChange = new ArrayList<>();

        flightsToCityList = flightList.getFlightsList().stream().filter(flight1 -> flight1.getToCity().equals(toCity)).collect(Collectors.toList());

        for (Flight flight : flightsToCityList) {
            flightsInterChange = flightList.getFlightsList().stream().filter(flight1 -> flight1.getFromCity().equals(fromCity) || flight1.getToCity().equals(flight)).collect(Collectors.toList());
        }

        for (Flight flight : flightsInterChange) {
            System.out.println(flight.getFromCity().getCityName() + " --> " + flight.getToCity().getCityName() + " --> " + toCity.getCityName());
        }

    }

}
