package FlightService;

import java.util.HashSet;
import java.util.Set;

public class FlightRoutes {

    private final Set<Flight> availableRoutes = new HashSet<>();

        public FlightRoutes() {
            availableRoutes.add (new Flight ("WAW", "POZ"));
            availableRoutes.add (new Flight ("KRA", "POZ"));
            availableRoutes.add (new Flight ("WAW", "KRA"));
            availableRoutes.add (new Flight ("POZ", "WAW"));
            availableRoutes.add (new Flight ("NYC", "WAW"));
            availableRoutes.add (new Flight ("KRA", "NYC"));

    }

    public Set<Flight> getAvailableRoutes() {
        return availableRoutes;
    }

}