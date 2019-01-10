package city;

import flights.Flight;
import flights.FlightList;

import java.util.ArrayList;

public class City {

    private FlightList flightList;
    private String cityName;

    public City(String cityName, FlightList flightList) {
        this.cityName = cityName;
        this.flightList = flightList;
    }

    public boolean addFlight(City city) {
        return flightList.addOneFlight(new Flight(city));
    }

    public boolean addFlights(ArrayList<City> cities) {
        return flightList.addAllFlightsList(cities);
    }

}
