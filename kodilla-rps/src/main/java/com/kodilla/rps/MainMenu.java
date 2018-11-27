package com.kodilla.rps;

public class MainMenu {

    public void showInstruction() {
        System.out.println(" ");
        System.out.println("<----Instruction---->");
        System.out.println("Key 1 : Stone");
        System.out.println("Key 2 : Paper");
        System.out.println("Key 3 : Shears");
        System.out.println("Key 4 : Lizard");
        System.out.println("Key 5 : Spock");
        System.out.println("Key x : End The Game");
        System.out.println("Key n : New Game");
        System.out.println(" ");
    }

    public void showInstructionOnEndGame() {
        System.out.println("--------GAME OVER ---------- ");
        System.out.println("######## MAKE A MOVE ######## ");
        System.out.println(" ");
        System.out.println("Key x : End The Game");
        System.out.println("Key n : New Game");
        System.out.println(" ");
    }


}
