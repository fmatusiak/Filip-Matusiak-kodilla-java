package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    User user;
    Round round;
    MainMenu mainMenu;
    Results results;

    Scanner scanner = new Scanner(System.in);
    boolean end = false;

    public Game(User user, Round round) {
        this.user = user;
        this.round = round;
    }

    public void runNewGame() {
        mainMenu = new MainMenu();
        results = new Results(user);
        newGame();
    }

    public void newGame() {

        do {
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
                    showDefaultMessage();
                    break;
                }
            }
            end = checkNumbersRound();

        }
        while (!end);

        results.showResultGame();

        ChoiceAtTheEndOfGame();

    }

    public void ChoiceAtTheEndOfGame() {
        mainMenu.showInstructionOnEndGame();
        System.out.println("-------------- ");
        System.out.print("Make a move: ");
        String reply = scanner.next();

        switch (reply) {
            case "x": {
                exitTheGame();
            }
            case "n": {
                createNewGame();
            }
            default: {
                showDefaultMessage();
                break;
            }
        }
    }

    public void showDefaultMessage() {
        System.out.println("Choose good options !!!!");
    }

    public void exitTheGame() {
        System.out.println("Are you sure you want to quit y/n ?");
        String reply = scanner.next();
        if (reply.equals("y")) {
            System.out.println("Exit the Game ....");
            System.exit(0);
        }

    }

    public void createNewGame() {
        System.out.println("Are you sure you want to create New Game ? y/n ?");
        String reply = scanner.next();
        if (reply.equals("y")) {
            mainMenu.createMainMenu();
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
            results.showResultsTie();

        } else if (tmpMoveUser == 1 && moveComputer == 2) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();

        } else if (tmpMoveUser == 1 && moveComputer == 3) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (tmpMoveUser == 2 && moveComputer == 1) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (tmpMoveUser == 2 && moveComputer == 3) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();

        } else if (tmpMoveUser == 3 && moveComputer == 2) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (tmpMoveUser == 3 && moveComputer == 1) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();
        }

    }
}
