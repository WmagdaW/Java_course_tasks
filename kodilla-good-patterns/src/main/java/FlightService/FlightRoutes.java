package FlightService;

import java.util.HashSet;
import java.util.Set;

public class FlightRoutes {

    private final Set<Flight> availableRoutes = new HashSet<>();

        public FlightRoutes() {
    }

    public Set<Flight> getAvailableRoutes() {
        return availableRoutes;
    }

}