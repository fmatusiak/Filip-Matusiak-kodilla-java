package com.kodilla.rps;

import java.util.Scanner;

public class User implements Points {
    private String userName;
    private int pointUser;

    @Override
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
