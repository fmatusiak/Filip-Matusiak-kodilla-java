package flights;

import java.util.Objects;

public class Flight {

    private String fromCity;
    private String toCity;

    public Flight(String fromCity, String toCity) {
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(fromCity, flight.fromCity) &&
                Objects.equals(toCity, flight.toCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromCity, toCity);
    }
}
