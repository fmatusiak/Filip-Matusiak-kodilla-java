package com.kodilla.rps;

public class Results {
    User user;

    private int pointUser;
    private int pointComputer;

    public Results(User user) {
        this.user = user;
    }


    public void addPointToUser() {
        pointUser++;
    }

    public void addPointToComputer() {
        pointComputer++;
    }

    public int getPointUser() {
        return pointUser;
    }

    public int getPointComputer() {
        return pointComputer;
    }

    public void showResultsWinnerComputer() {
        System.out.println("Winner Computer");
        showResultsRound();
    }

    public void showResultsWinnerUser() {
        System.out.println("Winner User " + user.getUserName());
        showResultsRound();
    }

    public void showResultsRound() {
        System.out.println(" ");
        System.out.println("#### Result ROUND ####");
        System.out.println("User score : " + pointUser);
        System.out.println("Computer score: " + pointComputer);
        System.out.println(" ");

    }

    public void showResultGame() {
        if (pointUser == pointComputer) {
            System.out.println(" ");
            System.out.println("#### Result GAME ####");
            System.out.println(user.getUserName() + " score: " + pointUser);
            System.out.println("Computer score: " + pointComputer);
            System.out.println(" !!!! TIE !!!!");
            System.out.println(" ");
        } else if (pointUser > pointComputer) {
            System.out.println(" ");
            System.out.println("#### Result GAME ####");
            System.out.println("Winner user ");
            System.out.println(user.getUserName() + " score: " + pointUser);
            System.out.println("Computer score: " + pointComputer);
            //win user
        } else {
            System.out.println(" ");
            System.out.println("#### Result GAME ####");
            System.out.println("Winner computer ");
            System.out.println("Computer score: " + pointComputer);
            System.out.println(user.getUserName() + "score: " + pointUser);
            //win computer
        }
    }
}
