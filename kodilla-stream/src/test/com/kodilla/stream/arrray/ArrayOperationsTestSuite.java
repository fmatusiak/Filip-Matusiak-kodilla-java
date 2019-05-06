package com.kodilla.stream.arrray;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        int[] list = {1, 2, 3, 4, 5, 6};

        double average = ArrayOperations.getAverage(list);

        Assert.assertEquals(3.5, average, 0.01);


    }
}
