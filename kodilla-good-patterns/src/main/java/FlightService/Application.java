package FlightService;

import java.util.Set;

public class Application {
    public static void main(String[] args) {

        FlightService flightService = new FlightService(new FlightRoutes());

        var result1 = flightService.flightsFrom("WAW");
        var result2 = flightService.flightsTo("POZ");
        var result3 = flightService.listFlights("NYC", "POZ");


        System.out.println (result1);
        System.out.println (result2);
        System.out.println (result3);
    }
}
