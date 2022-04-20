package exercicio_3_6;

import java.text.NumberFormat;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto() {
        super();
    }

    public Moto(String modelo, int ano, String placa, double valor, int cilindradas) {
        super(modelo, ano, placa, valor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public boolean setCilindradas(int cilindradas) {
        if (cilindradas <= 0) return false;
        this.cilindradas = cilindradas;
        return true;
    }

    @Override
    public double valorIPVA() {
        double percentual = 0.02;
        if (this.cilindradas <= 200) {
            percentual = 0;
        }
        return getValor() * percentual;
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        return "Carro Modelo: " + getModelo() +
                ", Ano: " + getAno() +
                ", Placa: " + getPlaca() +
                ", Valor: " + numberFormat.format(this.getValor()) +
                ", Cilindradas: " + cilindradas +
                ", Valor IPVA: " + numberFormat.format(valorIPVA());
    }
}
