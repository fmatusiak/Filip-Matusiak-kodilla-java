package com.kodilla.rps;

import java.util.Scanner;

public class MainMenu {
    private User user;
    private Game game;

    public MainMenu(){
        setUserAndNumberOfRounds();
        showInstruction();
        game = new Game(user);

    }


    public void showInstruction() {
        System.out.println("<----Instruction---->");
        System.out.println("Key 1 : Stone");
        System.out.println("Key 2 : Paper");
        System.out.println("Key 3 : Shears");
        System.out.println("Key x : End The Game");
        System.out.println("Key n : New Game");
    }

    public void setUserAndNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String userName = scanner.next();
        System.out.print("Enter number of rounds: ");
        int numberOfRounds = scanner.nextInt();
        user = new User(userName, numberOfRounds);
        System.out.println(" ");
    }
}
