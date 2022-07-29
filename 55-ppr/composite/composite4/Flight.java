package composite4;

public class Flight implements Route {

    private final int flightTime;
    private final double flightPrice;
    private final Route departure;
    private final Route destination;

    public Flight(int flightTime, double flightPrice, Route departure, Route destination) {
        this.flightTime = flightTime;
        this.flightPrice = flightPrice;
        this.departure = departure;
        this.destination = destination;
    }

    @Override
    public String getDescription() {
        return departure.getDescription() + "_" + destination.getDescription();
    }

    @Override
    public double getPrice() {
        return departure.getPrice() + destination.getPrice() + this.flightPrice;
    }

    @Override
    public int getTime() {
        return departure.getTime() + destination.getTime() + flightTime;
    }

    @Override
    public String toString() {
        return String.format("Flight: %s. Total price: $ %.2f. Flight time: %d min", getDescription(), getPrice(), getTime());
    }
}
