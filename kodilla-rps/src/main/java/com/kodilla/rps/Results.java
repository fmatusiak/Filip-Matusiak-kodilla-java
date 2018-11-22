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

    public void shgwResultsTie(){
        System.out.println("!!!!! TIE  !!!!!");
        showResultsRound();
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
        System.out.println("User score : " + getPointUser());
        System.out.println("Computer score: " + getPointComputer());
        System.out.println(" ");
    }

    public void showResultGame() {
        //TIE
        if (getPointUser() == getPointComputer()) {
            System.out.println(" ");
            System.out.println("#### Result GAME ####");
            System.out.println(" !!!! TIE !!!!");
            System.out.println(user.getUserName() + " score: " + getPointUser());
            System.out.println("Computer score: " + getPointComputer());
            System.out.println(" ");
        } else if (getPointUser() > getPointComputer()) {
            //win user
            System.out.println(" ");
            System.out.println("#### Result GAME ####");
            System.out.println("Winner user ");
            System.out.println(user.getUserName() + " score: " + getPointUser());
            System.out.println("Computer score: " + getPointComputer());
        } else {
            //win computer
            System.out.println(" ");
            System.out.println("#### Result GAME ####");
            System.out.println("Winner computer ");
            System.out.println("Computer score: " + getPointComputer());
            System.out.println(user.getUserName() + " score: " + getPointComputer());
        }
    }
}
