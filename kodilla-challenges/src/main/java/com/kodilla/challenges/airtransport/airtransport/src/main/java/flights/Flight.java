package flights;

import city.City;

public class Flight {

    private City toCity;

    public Flight(City toCity) {
        this.toCity = toCity;
    }

    public City getToCity() {
        return toCity;
    }
}
