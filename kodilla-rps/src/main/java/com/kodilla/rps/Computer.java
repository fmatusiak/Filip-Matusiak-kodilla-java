package com.kodilla.rps;

import java.util.Random;

public class Computer {

    private String moveComputer;
    private int pointComputer;

    public int getPoints() {
        return pointComputer;
    }

    public void addPointToComputer() {
        pointComputer++;
    }

    public String generateComputerTraffic() {
        Random generateRps = new Random();
        int moveComputer = generateRps.nextInt(5) + 1;
        return String.valueOf(moveComputer);
    }

}
