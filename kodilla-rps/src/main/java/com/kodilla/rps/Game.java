package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    User user;
    Round round;
    MainMenu mainMenu;
    Results results;
    Computer computer;
    WinChecker winChecker;

    Scanner scanner = new Scanner(System.in);

    public void newGame() {
        mainMenu = new MainMenu();
        user = new User();
        round = new Round();
        computer = new Computer();
        winChecker = new WinChecker();
        user.setUser();
        round.setNumberOfRounds();
        results = new Results(user,computer);
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

            if(moveChecker.checkMove(moveUser)) {
                if(moveUser.equals("n")){
                    createNewGame();
                } else if(moveUser.equals("x")){
                    ChoiceAtTheEndOfGame();
                } else {
                    showWhoIsWin(moveUser,moveComputer);
                }

            } else {
                showDefaultMessage();
                makeAMove();
            }
            end = checkNumbersRound();

            mainMenu.showInstruction();

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
        if (round.getNumberOfRounds() == computer.getPointComputer() || round.getNumberOfRounds() == user.getPointUser()) {
            return true;
        } else {
            return false;
        }

    }

    public void showWhoIsWin(String moveUser,String moveComputer){
        int whoIsWin = winChecker.checkWhoIsWin(moveUser,moveComputer);

        if(whoIsWin == 0){
            results.showResultsTie();
        }
        else if(whoIsWin == 1) {
            user.addPointToUser();
            results.showResultsWinnerUser();
        }
        else if(whoIsWin == 2){
            computer.addPointToComputer();
            results.showResultsWinnerComputer();
        }

    }
}
