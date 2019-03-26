package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15.0), cost);
    }

    @Test
    public void testBasicPizzaWithChickenGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new PizzaWithChicken(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(19.0), cost);
    }

    @Test
    public void testBasicPizzaWithHamAndChickenGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new PizzaWithChicken(pizzaOrder);
        pizzaOrder = new PizzaWithHam(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(22.0), cost);
    }

    @Test
    public void testBasicPizzaWithHamAndChickenAndOnionGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new PizzaWithChicken(pizzaOrder);
        pizzaOrder = new PizzaWithHam(pizzaOrder);
        pizzaOrder = new PizzaWithOnion(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(23.0), cost);
    }

    @Test
    public void testBasicPizzaWithHamAndChickenAndOnionGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new PizzaWithChicken(pizzaOrder);
        pizzaOrder = new PizzaWithHam(pizzaOrder);
        pizzaOrder = new PizzaWithOnion(pizzaOrder);

        //When
        String description = pizzaOrder.getTitlePizza();

        //Then
        assertEquals("Basic pizza + chicken + ham + onion", description);
    }

    @Test
    public void testBasicPizzaWithHamAndChickenGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new PizzaWithChicken(pizzaOrder);
        pizzaOrder = new PizzaWithHam(pizzaOrder);

        //When
        String description = pizzaOrder.getTitlePizza();

        //Then
        assertEquals("Basic pizza + chicken + ham", description);
    }

    @Test
    public void testBasicPizzaWithHamGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new PizzaWithHam(pizzaOrder);

        //When
        String description = pizzaOrder.getTitlePizza();

        //Then
        assertEquals("Basic pizza + ham", description);
    }

}
