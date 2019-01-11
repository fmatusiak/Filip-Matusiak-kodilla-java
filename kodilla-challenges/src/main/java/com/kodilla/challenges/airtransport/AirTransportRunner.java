package com.kodilla.challenges.airtransport;

import com.kodilla.challenges.airtransport.city.City;
import com.kodilla.challenges.airtransport.flights.Flight;
import com.kodilla.challenges.airtransport.flights.FlightFind;
import com.kodilla.challenges.airtransport.flights.FlightList;

public class AirTransportRunner {
    public static void main(String[] args) {

        FlightList flightList = new FlightList();

        City warsaw = new City("Warsaw");
        City gdansk = new City("Gdansk");
        City wroclaw = new City("Wroclaw");
        City zakopane = new City("Zakopane");

        Flight gdanskToWarsaw = new Flight(gdansk, warsaw);
        Flight gdanskToWroclaw = new Flight(gdansk, wroclaw);

        Flight warsawToGdansk = new Flight(warsaw, gdansk);
        Flight warsawToZakopane = new Flight(warsaw, zakopane);

        flightList.addOneFlight(gdanskToWarsaw);
        flightList.addOneFlight(gdanskToWroclaw);
        flightList.addOneFlight(warsawToGdansk);
        flightList.addOneFlight(warsawToZakopane);

        FlightFind flightFind = new FlightFind();

        flightFind.findFlight(flightList, gdansk, warsaw);

    }
}
