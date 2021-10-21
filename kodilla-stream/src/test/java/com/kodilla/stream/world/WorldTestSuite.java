package com.kodilla.stream.world;
import com.kodilla.stream.world.Continent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World ();
        Country Poland = new Country("Poland", (new BigDecimal ("38265000")));
        Country Spain = new Country("Spain", (new BigDecimal ("47394223396")));
        Country France = new Country("France", (new BigDecimal ("67022000")));
        Country China = new Country("China", (new BigDecimal ("1420000000")));
        Country India = new Country("India", (new BigDecimal ("1296384042")));
        Country Russia = new Country("Russia", (new BigDecimal ("146238185")));
        Continent Europe = new Continent ("Europe");
        Continent Asia = new Continent ("Asia");


        //When
        world.addContinents(Europe);
        world.addContinents(Asia);
        Europe.addCountries(Poland);
        Europe.addCountries(Spain);
        Europe.addCountries(France);
        Asia.addCountries(China);
        Asia.addCountries(India);
        Asia.addCountries(Russia);



        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedTotalPopulation = new BigDecimal("50362132623");
        Assertions.assertEquals(expectedTotalPopulation ,totalPopulation);
    }
}
