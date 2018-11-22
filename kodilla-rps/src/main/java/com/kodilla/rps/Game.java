package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    User user;
    Round round;
    Scanner scanner;

    private Results results;
    boolean end = false;

    public Game(User user, Round round) {
        this.user = user;
        this.round = round;
        results = new Results(user);
        newGame();
    }

    public void newGame() {

        do {

            scanner = new Scanner(System.in);
            System.out.print("Make a move : ");
            String moveUser = scanner.next();
            int moveComputer = generateComputerTraffic();

            switch (moveUser) {
                case "1": {
                    checkTheResults(moveUser, moveComputer);
                    break;
                }
                case "2": {
                    checkTheResults(moveUser, moveComputer);
                    break;
                }
                case "3": {
                    checkTheResults(moveUser, moveComputer);
                    break;
                }
                case "x": {
                    exitTheGame();
                    break;
                }
                case "n": {
                    createNewGame();
                    break;
                }
                default: {
                    System.out.println("Choose good options !!!!");
                    break;
                }
            }
            end = checkNumbersRound();

        }
        while (!end);

        results.showResultGame();

    }

    public void exitTheGame() {
        scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to quit y/n ?");
        String reply = scanner.next();
        if (reply.equals("y")) {
            System.exit(0);
        }

    }

    public void createNewGame() {
        scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to create New Game ? y/n ?");
        String reply = scanner.next();
        if (reply.equals("y")) {
            Game game = new Game(user, round);
            game.newGame();
        }
    }

    public boolean checkNumbersRound() {
        if (round.getNumberOfRounds() == results.getPointComputer() || round.getNumberOfRounds() == results.getPointUser()) {
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

    public void checkTheResults(String moveUser, int moveComputer) {

        int tmpMoveUser = Integer.parseInt(moveUser);

        if (tmpMoveUser == moveComputer) {
            results.showResultsRound();
            results.shgwResultsTie();

        } else if (tmpMoveUser == 1 && moveComputer == 2) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();

        } else if (tmpMoveUser == 1 && moveComputer == 3) {
            results.addPointToUser();
            results.showResultsWinnerUser();

        } else if (tmpMoveUser == 2 && moveComputer == 1) {
            results.addPointToUser();
            results.showResultsWinnerUser();

        } else if (tmpMoveUser == 2 && moveComputer == 3) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
        }

    }
}
