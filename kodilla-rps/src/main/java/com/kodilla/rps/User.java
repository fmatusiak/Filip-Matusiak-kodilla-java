package com.kodilla.rps;

public class User {
    private String userName;
    private int numberOfRounds;

    public User(String userName, int numberOfRounds) {
        this.userName = userName;
        this.numberOfRounds = numberOfRounds;
    }

    public String getUserName() {
        return userName;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }
}
