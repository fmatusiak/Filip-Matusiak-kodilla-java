package com.kodilla.rps;

import java.util.Scanner;

public class User {
    private String userName;
    private int pointUser;


    public int getPoints() {
        return pointUser;
    }

    public void setUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        userName = scanner.next();
    }

    public void addPointToUser() {
        pointUser++;
    }

    public String getUserName() {
        return userName;
    }

}
