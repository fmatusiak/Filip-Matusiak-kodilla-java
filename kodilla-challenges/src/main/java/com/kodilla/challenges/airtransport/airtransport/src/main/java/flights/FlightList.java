package flights;

import city.City;

import java.util.ArrayList;

public class FlightList {

    private ArrayList<Flight> flightsList = new ArrayList<>();

    public boolean addOneFlight(Flight flight) {
        return flightsList.add(flight);
    }

    public boolean addAllFlightsList(ArrayList<City> flightsList) {
        return flightsList.addAll(flightsList);
    }

    public ArrayList<Flight> getFlightsList() {
        return flightsList;
    }
}
