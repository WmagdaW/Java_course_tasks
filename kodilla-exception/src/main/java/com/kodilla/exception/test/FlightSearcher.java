package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlightSearcher {


    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Berlin", true);
        airports.put("Paris", false);
        airports.put("London", false);

        if (airports.containsKey(flight.getArrivalAirport())&&airports.containsKey(flight.getDepartureAirport())){
            if (!airports.get(flight.getDepartureAirport())){
                throw new RouteNotFoundException("Airport not found");
            }
        }else {
            throw new RouteNotFoundException("Airport not found");
        }
    }
}






