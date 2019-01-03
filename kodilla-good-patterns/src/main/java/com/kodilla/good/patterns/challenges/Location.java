package com.kodilla.good.patterns.challenges;

public class Location {

    private String fromPlace;
    private String toPlace;

    public Location(String fromPlace, String toPlace) {
        this.fromPlace = fromPlace;
        this.toPlace = toPlace;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public String getToPlace() {
        return toPlace;
    }
}
