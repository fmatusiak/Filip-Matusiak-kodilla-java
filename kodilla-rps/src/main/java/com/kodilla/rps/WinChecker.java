package com.kodilla.rps;

public class WinChecker {

    public int checkWhoIsWin(String moveUser, String moveComputer) {
        // 1 rock  , 2 - paper , 3 - scissors , 4 - lizard , 5 - spock
        if (moveUser.equals(moveComputer)) {
            return 0;

        } else if ((moveUser.equals("1") && moveComputer.equals("3")) || (moveUser.equals("2") && moveComputer.equals("1"))
                || (moveUser.equals("3") && moveComputer.equals("2")) || (moveUser.equals("1") && moveComputer.equals("4"))
                || (moveUser.equals("4") && moveComputer.equals("5")) || (moveUser.equals("5") && moveComputer.equals("3"))
                || (moveUser.equals("3") && moveComputer.equals("4")) || (moveUser.equals("4") && moveComputer.equals("2"))
                || (moveUser.equals("2") && moveComputer.equals("5")) || (moveUser.equals("5") && moveComputer.equals("1"))) {
            return 1;

        } else if ((moveUser.equals("5") && moveComputer.equals("4")) || (moveUser.equals("3") && moveComputer.equals("5"))
                || (moveUser.equals("4") && moveComputer.equals("3")) || (moveUser.equals("2") && moveComputer.equals("4"))
                || (moveUser.equals("5") && moveComputer.equals("2")) || (moveUser.equals("4") && moveComputer.equals("1"))
                || (moveUser.equals("1") && moveComputer.equals("5")) || moveUser.equals("1") && moveComputer.equals("2")
                || (moveUser.equals("2") && moveComputer.equals("3")) || (moveUser.equals("3") && moveComputer.equals("1"))) {
            return 2;
        }

        return -1;
    }
}
