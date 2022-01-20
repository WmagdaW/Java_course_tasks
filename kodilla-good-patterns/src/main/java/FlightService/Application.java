package FlightService;

import java.util.Set;

public class Application {
    public static void main(String[] args) {

        FlightService flightService = new FlightService(new FlightRoutes());

        flightService.flightsFrom("WAW");
        flightService.flightsTo("POZ");
        flightService.listFlights("WAW", "POZ");
    }
}
