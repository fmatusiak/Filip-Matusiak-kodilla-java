package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    User user;
    Round round;
    MainMenu mainMenu;
    Results results;
    Computer computer;

    Scanner scanner = new Scanner(System.in);

    public void newGame() {
        mainMenu = new MainMenu();
        user = new User();
        round = new Round();
        computer = new Computer();
        user.setUser();
        round.setNumberOfRounds();
        results = new Results(user);
        mainMenu.showInstruction();
        makeAMove();
    }

    public void makeAMove() {

        boolean end = false;

        do {
            System.out.print("Make a move : ");
            String moveUser = scanner.next();
            String moveComputer = computer.generateComputerTraffic();

            switch (moveUser) {
                case "1": {
                    //Stone
                    checkWhoIsWin(moveUser, moveComputer);
                    break;
                }
                case "2": {
                    //Paper
                    checkWhoIsWin(moveUser, moveComputer);
                    break;
                }
                case "3": {
                    //Shears
                    checkWhoIsWin(moveUser, moveComputer);
                    break;
                }
                case "4": {
                    //Lizard
                    checkWhoIsWin(moveUser, moveComputer);
                    break;
                }
                case "5": {
                    //Spock
                    checkWhoIsWin(moveUser, moveComputer);
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
            newGame();
        }
    }

    public boolean checkNumbersRound() {
        if (round.getNumberOfRounds() == results.getPointComputer() || round.getNumberOfRounds() == results.getPointUser()) {
            return true;
        } else {
            return false;
        }

    }

    public void checkWhoIsWin(String moveUser, String moveComputer) {

        if (moveUser.equals(moveComputer)) {
            results.showResultsRound();
            results.showResultsTie();

        } else if (moveUser.equals("1") && moveComputer.equals(2)) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();

        } else if (moveUser.equals("1") && moveComputer.equals("3")) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (moveUser.equals("2") && moveComputer.equals("1")) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (moveUser.equals("2") && moveComputer.equals("3")) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();

        } else if (moveUser.equals("3") && moveComputer.equals("2")) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (moveUser.equals("3") && moveComputer.equals("1")) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();

        } else if (moveUser.equals("1") && moveComputer.equals("4")) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (moveUser.equals("4") && moveComputer.equals("5")) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (moveUser.equals("5") && moveComputer.equals("3")) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (moveUser.equals("3") && moveComputer.equals("4")) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (moveUser.equals("4") && moveComputer.equals("2")) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (moveUser.equals("2") && moveComputer.equals("5")) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (moveUser.equals("5") && moveComputer.equals("1")) {
            results.addPointToUser();
            results.showResultsWinnerUser();
            results.showResultsRound();

        } else if (moveUser.equals("5") && moveComputer.equals("4")) {

            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();

        } else if (moveUser.equals("3") && moveComputer.equals("5")) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();

        } else if (moveUser.equals("4") && moveComputer.equals("3")) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();

        } else if (moveUser.equals("2") && moveComputer.equals("4")) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();

        } else if (moveUser.equals("5") && moveComputer.equals("2")) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();

        } else if (moveUser.equals("1") && moveComputer.equals("5")) {
            results.addPointToComputer();
            results.showResultsWinnerComputer();
            results.showResultsRound();

        }

    }
}
