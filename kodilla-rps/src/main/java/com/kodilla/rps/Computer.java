package com.kodilla.rps;

import java.util.Random;

public class Computer {
    private String moveComputer;
    private int pointComputer;

    public void addPointToComputer() {
        pointComputer++;
    }

    public int getPointComputer() {
        return pointComputer;
    }

    public String generateComputerTraffic() {
        Random generateRps = new Random();
        int tmpMoveComputer = generateRps.nextInt(5 - 1 + 1) + 1;

        if (tmpMoveComputer == 1) {
            moveComputer = "1";
        }
        if (tmpMoveComputer == 2) {
            moveComputer = "2";
        }
        if (tmpMoveComputer == 3) {
            moveComputer = "3";
        }
        if (tmpMoveComputer == 4) {
            moveComputer = "4";
        }
        if (tmpMoveComputer == 5) {
            moveComputer = "5";
        }

        return moveComputer;
    }
}
