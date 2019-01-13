package com.kodilla.spring;

import com.kodilla.spring.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultAdd = calculator.add(1, 2);
        double resultSub = calculator.sub(6, 5);
        double resultDiv = calculator.div(10, 5);
        double resultMul = calculator.mul(5, 3);

        //Then
        Assert.assertEquals(3, resultAdd, 0.1);
        Assert.assertEquals(1, resultSub, 0.1);
        Assert.assertEquals(2, resultDiv, 0.1);
        Assert.assertEquals(15, resultMul, 0.1);

    }
}
