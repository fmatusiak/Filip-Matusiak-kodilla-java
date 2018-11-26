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

    public void showResultsTie() {
        System.out.println(" ");
        System.out.println("!!!!! TIE  !!!!!");
        System.out.println(" ");
    }

    public void showResultsWinnerComputer() {
        System.out.println(" ");
        System.out.println("Winner Computer");
        System.out.println(" ");
    }

    public void showResultsWinnerUser() {
        System.out.println(" ");
        System.out.println("Winner User " + user.getUserName());
        System.out.println(" ");
    }

    public void showResultScore() {
        System.out.println(" ");
        System.out.println(user.getUserName() + " score : " + getPointUser());
        System.out.println("Computer score: " + getPointComputer());
        System.out.println(" ");
    }


    public void showResultsRound() {
        System.out.println("#### Result ROUND ####");
        showResultScore();
    }

    public void showResultGame() {

        if (getPointUser() == getPointComputer()) {
            //TIE
            System.out.println("#### Result GAME ####");
            showResultsTie();
            showResultScore();

        } else if (getPointUser() > getPointComputer()) {
            //win user
            System.out.println("#### Result GAME ####");
            showResultsWinnerUser();
            showResultScore();

        } else {
            //win computer
            System.out.println("#### Result GAME ####");
            showResultsWinnerComputer();
            showResultScore();

        }
    }
}
