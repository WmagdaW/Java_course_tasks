package FlightService;

public final class Flight {

    private final String arrivals;
    private final String departures;

    public Flight(String arrivals, String departures) {
        this.arrivals = arrivals;
        this.departures = departures;
    }

    public String getArrivals() {
        return arrivals;
    }

    public String getDepartures() {
        return departures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!arrivals.equals(flight.arrivals)) return false;
        return departures.equals(flight.departures);
    }

    @Override
    public int hashCode() {
        int result = arrivals.hashCode();
        result = 31 * result + departures.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arrivals='" + arrivals + '\'' +
                ", departures='" + departures + '\'' +
                '}';
    }
}
