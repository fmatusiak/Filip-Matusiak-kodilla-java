package com.kodilla.rps;

public class ResultChecker {

    public int checkResultGame(User user, Computer computer) {

        if (user.getPointUser() == computer.getPointComputer()) {
            //TIE
            return 0;

        } else if (user.getPointUser() > computer.getPointComputer()) {
            //win user
            return 1;

        } else {
            //win computer
            return 2;
        }

    }
}
