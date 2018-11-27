package com.kodilla.rps;

public class Results {

    User user;
    Computer computer;

    public Results(User user, Computer computer){
        this.user = user;
        this.computer = computer;
    }

    public void showResultsTie() {
        System.out.println(" ");
        System.out.println("!!!!! TIE  !!!!!");
        System.out.println(" ");
        showResultScore();
    }

    public void showResultsWinnerComputer() {
        System.out.println(" ");
        System.out.println("Winner Computer");
        System.out.println(" ");
        showResultScore();
    }

    public void showResultsWinnerUser() {
        System.out.println(" ");
        System.out.println("Winner User " + user.getUserName());
        System.out.println(" ");
        showResultScore();
    }

    public void showResultScore() {
        System.out.println(" ");
        System.out.println(user.getUserName() + " score : " + user.getPointUser());
        System.out.println("Computer score: " + computer.getPointComputer());
        System.out.println(" ");
    }


    public void showResultsRound() {
        System.out.println("#### Result ROUND ####");
        showResultScore();
    }

    public void showResultGame() {

        if (user.getPointUser() == computer.getPointComputer()) {
            //TIE
            System.out.println("#### Result GAME ####");
            showResultsTie();


        } else if (user.getPointUser() > computer.getPointComputer()) {
            //win user
            System.out.println("#### Result GAME ####");
            showResultsWinnerUser();


        } else {
            //win computer
            System.out.println("#### Result GAME ####");
            showResultsWinnerComputer();


        }
    }
}
