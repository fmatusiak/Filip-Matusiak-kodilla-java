package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private User user;
    private Results results;
    boolean end = false;

    public Game(User user) {
        this.user = user;
        results = new Results(user);
        newGame();
    }

    public void newGame() {

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Make a move : ");
            String moveUser = scanner.next();

            if(isNumeric(moveUser)){
                int intMoveUser = Integer.parseInt(moveUser);
                int moveComputer = generateComputerTraffic();
                checkTheResults(intMoveUser, moveComputer);
                end = checkNumbersRound();
            }else if(moveUser.equals("x")){
                System.out.println("    END THE GAME  ");
                end = true;
            }else if(moveUser.equals("n")){
               MainMenu mainMenu = new MainMenu();
            }

        }
        while (!end);

        results.showResultGame();

    }

    public boolean checkNumbersRound() {
        if (user.getNumberOfRounds() == results.getPointUser() || user.getNumberOfRounds() == results.getPointComputer()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNumeric(String str)
    {
        try
        {
            int d = Integer.parseInt(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }



    public int generateComputerTraffic() {
        Random generateRps = new Random();
        int moveComputer = generateRps.nextInt(3 - 1 + 1) + 1;
        return moveComputer;
    }

    public void checkTheResults(int moveUser, int moveComputer) {

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
