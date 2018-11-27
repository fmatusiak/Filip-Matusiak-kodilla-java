package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class MoveChecker {

    public boolean checkMove(String moveUser){
        List<String> moveValue = new ArrayList<>();
        moveValue.add("1");
        moveValue.add("2");
        moveValue.add("3");
        moveValue.add("4");
        moveValue.add("5");
        moveValue.add("x");
        moveValue.add("n");

        if(moveValue.contains(moveUser)){
            return true;
        } else
        return false;
    }

}
