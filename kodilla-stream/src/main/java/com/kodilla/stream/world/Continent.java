package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String name;
    private final List<Country> countriesList = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountriesList() {
        return countriesList;
    }
    public void addCountries(Country country){
        countriesList.add(country);
    }
}
