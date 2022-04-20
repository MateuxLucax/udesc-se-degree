package exercicio_2_7;

public class Exercicio_2_7 {

    public static void main(String[] args) {
        Agencia agencia1 = new Agencia(1, "Rio do Sul", 2001);
        Agencia agencia2 = new Agencia(2, "Rio do Sul", 2010);
        Agencia agencia3 = new Agencia(3, "Ituporanga", 2001);
        Agencia agencia4 = new Agencia(4, "Aurora", 2000);

        Banco banco1 = new Banco(1, "YouBank");
        banco1.addAgencia(agencia1);
        banco1.addAgencia(agencia2);
        banco1.addAgencia(agencia3);
        banco1.addAgencia(agencia4);

        banco1.imprimirAgencias();
        banco1.imprimirAgencias(2001);
        banco1.imprimirAgencias("Rio do Sul");

        System.out.println(banco1.getAgencia(1));
        System.out.println(banco1.getAgencia(5));
    }
}
