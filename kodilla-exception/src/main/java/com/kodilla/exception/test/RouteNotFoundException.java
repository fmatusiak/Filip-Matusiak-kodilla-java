package com.kodilla.exception.test;

public class RouteNotFoundException extends Throwable {
    public void showAlert(){
        System.out.println("The airport  is not in the base");
    }

}
