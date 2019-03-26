package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithChicken extends AbstractPizzaOrderDecorator {
    protected PizzaWithChicken(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(Ingredients.CHICKEN.getCostIngredient());
    }

    @Override
    public String titlePizza() {
        return super.titlePizza() + " + chicken";
    }
}
