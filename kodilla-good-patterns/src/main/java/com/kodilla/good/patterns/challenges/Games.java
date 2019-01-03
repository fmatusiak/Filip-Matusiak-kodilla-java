package com.kodilla.good.patterns.challenges;

public class Games implements Product {

    private String nameGame;
    private String typeGame;
    private int howManyYearsAllowGame;

    public Games(String nameGame, String typeGame, int howManyYearsAllowGame) {
        this.nameGame = nameGame;
        this.typeGame = typeGame;
        this.howManyYearsAllowGame = howManyYearsAllowGame;
    }

    @Override
    public String getProductName() {
        return nameGame;
    }

    @Override
    public String getProductType() {
        return typeGame;
    }

    public int getHowManyYearsAllowGame() {
        return howManyYearsAllowGame;
    }
}
