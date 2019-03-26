package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithOnion extends AbstractPizzaOrderDecorator {
    protected PizzaWithOnion(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(Ingredients.ONION.getCostIngredient());
    }

    @Override
    public String titlePizza() {
        return super.titlePizza() + " + onion";
    }
}
