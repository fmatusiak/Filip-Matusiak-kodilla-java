package com.kodilla.rps;

public class WinChecker {
    public int  checkWhoIsWin(String moveUser, String moveComputer) {

        if (moveUser.equals(moveComputer)) {
            return 0;

        } else if (moveUser.equals("1") && moveComputer.equals("2")) {
            return 2;

        } else if (moveUser.equals("1") && moveComputer.equals("3")) {
            return 1;

        } else if (moveUser.equals("2") && moveComputer.equals("1")) {
            return 1;

        } else if (moveUser.equals("2") && moveComputer.equals("3")) {
            return 2;

        } else if (moveUser.equals("3") && moveComputer.equals("2")) {
            return 1;

        } else if (moveUser.equals("3") && moveComputer.equals("1")) {
            return 2;

        } else if (moveUser.equals("1") && moveComputer.equals("4")) {
            return 1;

        } else if (moveUser.equals("4") && moveComputer.equals("5")) {
            return 1;

        } else if (moveUser.equals("5") && moveComputer.equals("3")) {
            return 1;

        } else if (moveUser.equals("3") && moveComputer.equals("4")) {
            return 1;

        } else if (moveUser.equals("4") && moveComputer.equals("2")) {
            return 1;

        } else if (moveUser.equals("2") && moveComputer.equals("5")) {
            return 1;

        } else if (moveUser.equals("5") && moveComputer.equals("1")) {
            return 1;

        } else if (moveUser.equals("5") && moveComputer.equals("4")) {
            return 2;

        } else if (moveUser.equals("3") && moveComputer.equals("5")) {
            return 2;

        } else if (moveUser.equals("4") && moveComputer.equals("3")) {
            return 2;

        } else if (moveUser.equals("2") && moveComputer.equals("4")) {
            return 2;

        } else if (moveUser.equals("5") && moveComputer.equals("2")) {
            return 2;

        } else if (moveUser.equals("1") && moveComputer.equals("5")) {
            return 2;

        }

        return -1;
    }
}
