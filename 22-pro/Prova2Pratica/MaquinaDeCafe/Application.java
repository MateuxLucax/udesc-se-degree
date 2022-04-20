public class Application {

    public static void main(String[] args) {
        MaquinaDeCafe maq1 = new MaquinaDeCafe("Ceavi");

        maq1.adicionarCafe(250);
        maq1.alterarPrecoCafe(2.00);
        maq1.prepararCafe(10, 30.00);

        System.out.println(maq1.toString());

        maq1.prepararCafe(10, 20.00);

        System.out.println(maq1.toString());

        maq1.adicionarCafe(250);
        maq1.prepararCafe(10, 20.00);

        System.out.println(maq1.toString());

        MaquinaDeCafe maq2 = new MaquinaDeCafe("Padaria");
        maq2.adicionarCafe(500);
        maq2.alterarPrecoCafe(1.50);
        maq2.prepararCafe(1, 2.00);

        System.out.println(maq2.toString());

        maq2.prepararCafe(5, 10.00);

        System.out.println(maq2.toString());

        maq2.prepararCafe(5, 5.00);

        System.out.println(maq2.toString());

        maq2.prepararCafe(20, 30.00);

        System.out.println(maq2.toString());

        maq2.alterarPrecoCafe(2.50);
        maq2.prepararCafe(10, 20.00);

        System.out.println(maq2.toString());

        maq2.prepararCafe(10, 25.00);
        System.out.println(maq2.toString());
    }
}
