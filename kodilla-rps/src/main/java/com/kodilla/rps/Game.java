package com.kodilla.rps;

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
        results = new Results(user, computer);
        mainMenu.showInstruction();
        makeAMove();
    }

    public void makeAMove() {
        MoveChecker moveChecker = new MoveChecker();

        boolean end = false;

        do {
            System.out.print("Make a move : ");
            String moveUser = scanner.next();
            String moveComputer = computer.generateComputerTraffic();

            if (moveChecker.checkMove(moveUser)) {
                if (moveUser.equals("n")) {
                    createNewGame();
                } else if (moveUser.equals("x")) {
                    exitTheGame();
                } else {
                    checkWhoIsWin(moveUser, moveComputer);
                }

            } else {
                showDefaultMessage();
                makeAMove();
            }
            end = checkNumbersRound();

            mainMenu.showInstruction();

        }
        while (!end);

        checkResultGame(user, computer);

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
        System.out.println("Choose no good options !!!!");
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
        if (round.getNumberOfRounds() == computer.getPoints() || round.getNumberOfRounds() == user.getPoints()) {
            return true;
        } else {
            return false;
        }

    }

    public void checkWhoIsWin(String moveUser, String moveComputer) {
        WinChecker winChecker = new WinChecker();
        int whoIsWin = winChecker.checkWhoIsWin(moveUser, moveComputer);

        if (whoIsWin == 0) {
            results.showResultsTie();
        } else if (whoIsWin == 1) {
            user.addPointToUser();
            results.showResultsWinnerUser();
        } else if (whoIsWin == 2) {
            computer.addPointToComputer();
            results.showResultsWinnerComputer();
        }

    }

    public void checkResultGame(User user, Computer computer) {
        ResultChecker resultChecker = new ResultChecker();
        int resultGame = resultChecker.checkResultGame(user, computer);

        System.out.println("#### END GAME ####");
        if (resultGame == 0) {
            results.showResultsTie();
        } else if (resultGame == 1) {
            results.showResultsWinnerUser();
        } else if (resultGame == 2) {
            results.showResultsWinnerComputer();
        }
    }


}

