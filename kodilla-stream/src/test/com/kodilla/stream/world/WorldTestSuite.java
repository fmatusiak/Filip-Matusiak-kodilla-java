package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent asia = new Continent();
        Continent africa = new Continent();
        Continent europe = new Continent();

        World world = new World();

        asia.addCountry(new Country("Armenia",new BigDecimal(1231231)));
        asia.addCountry(new Country("China",new BigDecimal(43564343)));

        africa.addCountry(new Country("Algeria",new BigDecimal(8546845)));
        africa.addCountry(new Country("Angola",new BigDecimal(9845959)));

        europe.addCountry(new Country("Italy",new BigDecimal(34534131)));
        europe.addCountry(new Country("Belgium",new BigDecimal(893532432)));

        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(europe);

        //Then
        BigDecimal countPeopleQuantity = world.getPeopleQuantity();

        //When
        BigDecimal expectedQuantityOfPeople = new BigDecimal(991254941);

        Assert.assertEquals(expectedQuantityOfPeople,countPeopleQuantity);
    }
}
