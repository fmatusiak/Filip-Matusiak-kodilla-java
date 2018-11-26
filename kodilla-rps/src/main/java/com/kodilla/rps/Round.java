package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Round {
    private int numberOfRounds;

    public void setNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rounds: ");
        try {
            numberOfRounds = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can write number of rounds !!!");
        }

    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }


}
