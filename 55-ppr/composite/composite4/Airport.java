package composite4;

import java.util.Objects;

public class Airport implements Route {

    private final String ICAOCode;
    private final double connectionTax;
    private final int awaitTime;

    public Airport(String ICAOCode, double connectionTax, int awaitTime) {
        this.ICAOCode = ICAOCode;
        this.connectionTax = connectionTax;
        this.awaitTime = awaitTime;
    }

    @Override
    public String getDescription() {
        return ICAOCode;
    }

    @Override
    public double getPrice() {
        return connectionTax;
    }

    @Override
    public int getTime() {
        return awaitTime;
    }
}
