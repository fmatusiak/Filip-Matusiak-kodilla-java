package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private MainMenu mainMenu;
    private User user;
    private Results results;
    boolean end = false;

    public Game(User user) {
        this.user = user;
        results = new Results(user);
        newGame();
    }

    public void newGame() {
        end = checkNumbersRound();

        while (!end) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Make a move : ");
            int moveUser = scanner.nextInt();
            int moveComputer = generateComputerTraffic();

            checkResult(moveUser, moveComputer);
            end = checkNumbersRound();
        }

        results.showResultGame();

    }

    public boolean checkNumbersRound() {
        if (user.getNumberOfRounds() == results.getPointUser() || user.getNumberOfRounds() == results.getPointComputer()) {
            return true;
        } else {
            return false;
        }
    }


    public int generateComputerTraffic() {
        Random generateRps = new Random();
        int moveComputer = generateRps.nextInt(3 - 1 + 1) + 1;
        return moveComputer;
    }

    public void checkResult(int moveUser, int moveComputer) {

        if (moveUser == moveComputer) {
            results.showResultsRound();
            System.out.println("!!! TIE !!!");

        } else if (moveUser == 1 && moveComputer == 2) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
        } else if (moveUser == 1 && moveComputer == 3) {
            results.addPointToUser();
            results.showResultsWinnerUser();

        } else if (moveUser == 2 && moveComputer == 1) {
            results.addPointToUser();
            results.showResultsWinnerUser();
        } else if (moveUser == 2 && moveComputer == 3) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
        }

    }
}
