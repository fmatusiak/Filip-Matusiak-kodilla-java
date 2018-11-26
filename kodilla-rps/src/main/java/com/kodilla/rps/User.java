package com.kodilla.rps;

import java.util.Scanner;

public class User {
    private String userName;

    public void setUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        userName = scanner.next();
    }

    public String getUserName() {
        return userName;
    }

}
