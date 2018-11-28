package com.kodilla.rps;

public class ResultChecker {

    public int checkResultGame(User user, Computer computer) {
        if (user.getPoints() == computer.getPoints()) {
            //tie
            return 0;
        } else if (user.getPoints() > computer.getPoints()) {
            //win user
            return 1;
        } else {
            //win computer
            return 2;
        }

    }
}
