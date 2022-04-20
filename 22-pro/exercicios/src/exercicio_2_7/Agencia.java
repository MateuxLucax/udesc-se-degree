package exercicio_2_7;

public class Agencia {

    private int numero;

    private String cidade;

    private int anoDeAbertura;

    public Agencia(int numero, String cidade, int anoDeAbertura) {
        this.numero = numero;
        this.cidade = cidade;
        this.anoDeAbertura = anoDeAbertura;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public int getAnoDeAbertura() {
        return anoDeAbertura;
    }

    @Override
    public String toString() {
        return "Agencia - " +
                "numero " + numero +
                ", cidade: " + cidade +
                ", anoDeAbertura: " + anoDeAbertura;
    }
}
