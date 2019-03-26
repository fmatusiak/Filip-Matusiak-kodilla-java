package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithHam extends AbstractPizzaOrderDecorator {
    protected PizzaWithHam(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(Ingredients.HAM.getCostIngredient());
    }

    @Override
    public String titlePizza() {
        return super.titlePizza() + " + ham";
    }
}
