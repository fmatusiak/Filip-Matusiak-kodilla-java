package com.kodilla.exception.test;

import java.util.HashMap;

public class ServiceFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> availabilityAirpot = new HashMap<>();

        availabilityAirpot.put("Okecie", true);
        availabilityAirpot.put("Bemowo", false);

        if (availabilityAirpot.containsKey(flight.getArrivalAirport())) {
            if (availabilityAirpot.get(flight.getArrivalAirport())) {
                System.out.println("The arrival was booked");
                availabilityAirpot.put(flight.getArrivalAirport(), false);

            } else {
                System.out.println("The airport is busy");
            }
        } else {
            throw new RouteNotFoundException();
        }

    }

    public static void main(String[] args) {
        Flight flight = new Flight("MIAMI", "Okecie");
        Flight flightSecond = new Flight("BOSTON", "Bemowo");
        Flight flightthird = new Flight("Dubaj", "Wroclaw");
        ServiceFlight serviceFlight = new ServiceFlight();
        try {
            serviceFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            e.showAlert(flight.getArrivalAirport());
        }
        try {
            serviceFlight.findFlight(flightSecond);
        } catch (RouteNotFoundException e) {
            e.showAlert(flightSecond.getArrivalAirport());
        }
        try {
            serviceFlight.findFlight(flightthird);
        } catch (RouteNotFoundException e) {
            e.showAlert(flightthird.getArrivalAirport());
        }
    }

}
