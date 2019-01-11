package com.kodilla.challenges.airtransport.flights;

import java.util.ArrayList;

public class FlightList {

    private ArrayList<Flight> flightsList = new ArrayList<>();

    public boolean addOneFlight(Flight flight) {
        return flightsList.add(flight);
    }

    public boolean addAllFlightsList(ArrayList<Flight> flightsList) {
        return flightsList.addAll(flightsList);
    }

    public ArrayList<Flight> getFlightsList() {
        return flightsList;
    }
}
