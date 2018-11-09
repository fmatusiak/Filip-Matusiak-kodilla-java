package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> emptyNumbers = new ArrayList<>();

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        emptyNumbers = oddNumbersExterminator.exterminate(numbers);

        System.out.println("Testing empty List .. ");

        Assert.assertEquals(numbers, emptyNumbers);

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> notEvenNumbers = new ArrayList<>();


        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();


        for (int i = 0; i < 20; i += 2) {
            numbers.add(i);
        }

        evenNumbers = oddNumbersExterminator.exterminate(numbers);

        System.out.println("Testing Normal List .. ");

        Assert.assertEquals(numbers, evenNumbers);

        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }

        notEvenNumbers = oddNumbersExterminator.exterminate(numbers);

        Assert.assertNotEquals(numbers, notEvenNumbers);


    }
}
