package com.kodilla.rps;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    User user;
    Round round;

    Scanner scanner = new Scanner(System.in);

    public void createMainMenu() {
        Game game;
        setUser();
        setNumberOfRounds();
        showInstruction();
        game = new Game(user, round);
        game.runNewGame();
    }

    public void showInstruction() {
        System.out.println(" ");
        System.out.println("<----Instruction---->");
        System.out.println("Key 1 : Stone");
        System.out.println("Key 2 : Paper");
        System.out.println("Key 3 : Shears");
        System.out.println("Key x : End The Game");
        System.out.println("Key n : New Game");
        System.out.println(" ");
    }

    public void showInstructionOnEndGame() {
        System.out.println("####################### ");
        System.out.println(" ");
        System.out.println("Key x : End The Game");
        System.out.println("Key n : New Game");
        System.out.println(" ");
    }

    public void setUser() {
        System.out.print("Enter name: ");
        String userName = scanner.next();
        user = new User(userName);
    }

    public void setNumberOfRounds() {
        System.out.print("Enter number of rounds: ");
        int numberOfRounds;
        try {
            numberOfRounds = scanner.nextInt();
            round = new Round(numberOfRounds);
        } catch (InputMismatchException e) {
            System.out.println("You can write number of rounds !!!");
        }

    }

}
