package com.kodilla.exception.test;

public class RouteNotFoundException extends Throwable {
    public void showAlert(String arrivalAirport){
        System.out.println("The airport " + arrivalAirport + " is not in the base");
    }

}
