package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) {
        double resultsDivide = 0;
        try {
            resultsDivide = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by ZERO");
        } finally {
            System.out.println(" #### The task was completed #### ");
        }

        return resultsDivide;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);
    }
}
