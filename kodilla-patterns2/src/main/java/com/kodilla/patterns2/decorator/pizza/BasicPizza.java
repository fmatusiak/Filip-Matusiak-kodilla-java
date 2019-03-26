package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return Ingredients.CAKE.getCostIngredient()
                .add(Ingredients.SAUCE.getCostIngredient())
                .add(Ingredients.CHESSE.getCostIngredient());
    }

    @Override
    public String getTitlePizza() {
        return "Basic pizza";
    }

}
