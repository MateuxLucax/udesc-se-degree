package composite4;

public class Application {

    public static void main(String[] args) {
        Airport poa = new Airport("POA", 50.59, 30);
        Airport fln = new Airport("FLN", 35.89, 15);
        Airport cwb = new Airport("CWB", 24.39, 20);

        Flight poa_fln = new Flight(45, 150.54, poa, fln);
        System.out.println(poa_fln);
    }

}
