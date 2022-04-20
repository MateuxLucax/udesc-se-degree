import java.text.NumberFormat;

public class Carro extends Veiculo {

    private int portas;

    private boolean alugado;

    public Carro() {
        super();
    }

    public Carro(String modelo, int ano, String placa, double valor, int portas, boolean alugado) {
        super(modelo, ano, placa, valor);
        this.portas = portas;
        this.alugado = alugado;
    }

    public int getPortas() {
        return portas;
    }

    public boolean setPortas(int portas) {
        if (portas <= 0) return false;
        this.portas = portas;
        return true;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public boolean setAlugado(boolean alugado) {
        if (this.alugado == alugado) return false;
        this.alugado = alugado;
        return true;
    }

    @Override
    public double valorIPVA() {
        double percentual = 0.02;
        if (this.alugado) {
            percentual = 0.01;
        }
        return getValor() * percentual;
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        return "Moto Modelo: " + getModelo() +
                ", Ano: " + getAno() +
                ", Placa: " + getPlaca() +
                ", Valor: " + numberFormat.format(this.getValor()) +
                ", Portas: " + portas +
                ", Alugado: " + alugado +
                ", Valor IPVA: " + numberFormat.format(valorIPVA());
    }
}
