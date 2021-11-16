package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {
        FlightSearcher searcher = new FlightSearcher();
        Flight flight1 = new Flight ("Warsaw", "London");
        Flight flight2 = new Flight ("London", "Paris");
        Flight flight3 = new Flight ("Paris", "Berlin");
        Flight flight4 = new Flight ("Berlin", "Warsaw");
        Flight flight5 = new Flight ("London", "Rome");

        try {
            searcher.findFlight(flight1);
            System.out.println("Flight Warsaw - London available");
        } catch (RouteNotFoundException e) {
            System.out.println("No such arrival/departure airport found.");
        }
        try {
            searcher.findFlight(flight2);
            System.out.println("Flight London - Paris available");
        } catch (RouteNotFoundException e) {
            System.out.println("No such arrival/departure airport found.");
        }
        try {
          searcher.findFlight(flight3);
            System.out.println("Flight Paris - Berlin available");
        } catch (RouteNotFoundException e) {
            System.out.println("No such arrival/departure airport found.");
        }
        try {
            searcher.findFlight(flight4);
            System.out.println("Flight Berlin - Warsaw available");
        } catch (RouteNotFoundException e) {
            System.out.println("No such arrival/departure airport found.");
        }
        try {
            searcher.findFlight(flight5);
            System.out.println("Flight London - Rome available");
        } catch (RouteNotFoundException e) {
            System.out.println("No such arrival/departure airport found.");
        }
    }
}
