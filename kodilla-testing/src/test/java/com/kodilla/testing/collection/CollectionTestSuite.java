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

        Assert.assertNotNull(emptyNumbers);

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();


        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }

        evenNumbers = oddNumbersExterminator.exterminate(numbers);

        System.out.println("Testing Normal List .. ");

        for (Integer evenNumber : evenNumbers) {
            if (evenNumber % 2 == 0) {
                Assert.assertTrue(true);
            } else
                Assert.assertFalse(false);
        }


    }
}
