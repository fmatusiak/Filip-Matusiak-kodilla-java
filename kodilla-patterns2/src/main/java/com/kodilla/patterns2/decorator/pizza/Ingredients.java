package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public enum Ingredients {
    HAM(new BigDecimal(3.0)), ONION(new BigDecimal(1.0)),
    CHESSE(new BigDecimal(3.0)), CAKE(new BigDecimal(10)),
    SAUCE(new BigDecimal(2.0)), CHICKEN(new BigDecimal(4.0));

    private BigDecimal costIngredient;

    Ingredients(BigDecimal costIngredient) {
        this.costIngredient = costIngredient;
    }

    public BigDecimal getCostIngredient() {
        return costIngredient;
    }
}
