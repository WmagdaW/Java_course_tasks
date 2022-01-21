package FlightService;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {

    private final FlightRoutes flightRoutes;

    public FlightService(FlightRoutes flightRoutes) {
        this.flightRoutes = flightRoutes;
    }

    public Set<Flight> flightsFrom(String departureAirport) {
        return flightRoutes.getAvailableRoutes().stream()
                .filter(route -> route.getDepartures().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> flightsTo(String arrivalAirport) {
        return flightRoutes.getAvailableRoutes().stream()
                .filter(route -> route.getArrivals().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<Set<Flight>> listFlights (String arrivals, String departures) {
        Set<Flight> from = flightsFrom(departures);
        Set<Flight> to = flightsTo (arrivals);
        Set<Set<Flight>> flights = new HashSet<>();
        from.stream()
                .filter(flight -> to.contains(new Flight(arrivals, flight.getArrivals())))
                .forEach(flight -> flights.add(Set.of(flight,new Flight(flight.getArrivals(),arrivals))));
        return flights;
    }
}
