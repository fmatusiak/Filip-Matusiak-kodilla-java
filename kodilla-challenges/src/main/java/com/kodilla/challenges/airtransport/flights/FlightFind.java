package com.kodilla.challenges.airtransport.flights;

import com.kodilla.challenges.airtransport.city.City;

public class FlightFind {

    public void findFlight(FlightList flightList, City fromCity, City toCity) {

        //ArrayList<Flight> sophisticatedFlights = new ArrayList<>();

        for (Flight flight : flightList.getFlightsList()) {
            if (flight.getFromCity().equals(fromCity) && flight.getToCity().equals(toCity)) {
                System.out.println("Znaleziono lot: " + flight.getToCity().getCityName() + " - " + flight.getFromCity().getCityName());
            }
        }

    }


}
