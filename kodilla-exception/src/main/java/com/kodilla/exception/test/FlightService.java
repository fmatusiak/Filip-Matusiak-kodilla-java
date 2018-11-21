package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightService {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> availabilityAirpot = new HashMap<>();

        availabilityAirpot.put("OKECIE", true);
        availabilityAirpot.put("BEMOWO", false);
        availabilityAirpot.put("MIAMI", true);
        availabilityAirpot.put("BOSTON", true);

        if (availabilityAirpot.containsKey(flight.getArrivalAirport()) && availabilityAirpot.containsKey(flight.getDepartureAirport())) {
            if (availabilityAirpot.get(flight.getArrivalAirport()) && availabilityAirpot.get(flight.getDepartureAirport())) {
                System.out.println("The arrival was booked");
                availabilityAirpot.put(flight.getArrivalAirport(), false);
                availabilityAirpot.put(flight.getDepartureAirport(), false);

            } else {
                System.out.println("The airport is busy");
            }
        } else {
            throw new RouteNotFoundException();
        }

    }

    public static void main(String[] args) {
        Flight flight = new Flight("MIAMI", "OKECIE");
        Flight flightSecond = new Flight("BOSTON", "BEMOWO");
        Flight flightthird = new Flight("DUBAJ", "WROCLAW");

        FlightService serviceFlight = new FlightService();
        try {
            serviceFlight.findFlight(flight);
            serviceFlight.findFlight(flightSecond);
            serviceFlight.findFlight(flightthird);
        } catch (RouteNotFoundException e) {
            e.showAlert();
        }

    }

}
