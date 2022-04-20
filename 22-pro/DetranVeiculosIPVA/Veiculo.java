import java.text.NumberFormat;

public class Veiculo {

    private String modelo;

    private int ano;

    private String placa;

    private double valor;

    public Veiculo() {

    }

    public Veiculo(String modelo, int ano, String placa, double valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean setModelo(String modelo) {
        if (modelo.isBlank()) return false;
        this.modelo = modelo;
        return true;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean setPlaca(String placa) {
        if (placa.isBlank()) return false;
        this.placa = placa;
        return true;
    }

    public double getValor() {
        return valor;
    }

    public boolean setValor(double valor) {
        if (valor <= 0) return false;
        this.valor = valor;
        return true;
    }

    public double valorIPVA() {
        return 0;
    }

    @Override
    public String toString() {
        return "Veiculo Modelo: " + modelo +
                ", Ano: " + ano +
                ", Placa: " + placa +
                ", Valor: " + NumberFormat.getCurrencyInstance().format(valor);
    }
}
