package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("thin").burgers(3)
                .ingredient(Bigmac.BECON)
                .ingredient(Bigmac.CUCUMBER)
                .ingredient(Bigmac.ONION)
                .sauce(Bigmac.SAUCE_BARBECUE)
                .build();

        //When
        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        int ingredientsSize = bigmac.getIngredients().size();
        String sauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(bun, "thin");
        Assert.assertEquals(burgers, 3);
        Assert.assertEquals(ingredientsSize, 3);
        Assert.assertEquals(sauce, "BARBECUE");
    }
}
