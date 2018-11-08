package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test ok");
        } else {
            System.out.println("Error");
        }

        System.out.println(" \n First unit test");

        Calculator calculator = new Calculator();

        int add = calculator.add(5, 10);
        int subtract = calculator.subtract(20, 3);

        if (add == 13) {
            System.out.println("Test add ok");
        } else {
            System.out.println("Test add error");
        }

        if (subtract == 17) {
            System.out.println("Test subtract ok");
        } else {
            System.out.print("Test subtract error");
        }
    }
}
