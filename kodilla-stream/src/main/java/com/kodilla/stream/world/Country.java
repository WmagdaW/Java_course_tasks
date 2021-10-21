package com.kodilla.stream.world;

import java.math.BigDecimal;


public class Country {

    private final String name;
    private final BigDecimal population;

    public Country(String name, BigDecimal population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    BigDecimal getPeopleQuantity(){
        return population;
    }


}
