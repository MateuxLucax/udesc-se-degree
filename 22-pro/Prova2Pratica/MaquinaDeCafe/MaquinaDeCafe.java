import java.text.NumberFormat;
import java.util.Locale;

public class MaquinaDeCafe {

    private String localizacao;
    private double precoUnitario;
    private int quantidadePoCafe;
    private double receita;
    private int quantidadeCafePreparado;

    public MaquinaDeCafe(String localizacao) {
        this.localizacao = localizacao;
        this.quantidadePoCafe = 0;
        this.receita = 0;
        this.quantidadeCafePreparado = 0;
        this.precoUnitario = 0;
    }

    public boolean alterarPrecoCafe(double novoPreco) {
        if (novoPreco > 0 && novoPreco != this.precoUnitario) {
            this.precoUnitario = novoPreco;
            return true;
        }
        return false;
    }

    public boolean adicionarCafe(int quantidade) {
        if (quantidade > 0) {
            this.quantidadePoCafe += quantidade;
            return true;
        }
        return false;
    }

    public double prepararCafe(int quantidade, double pagamento) {
        int quantidadeDePoCafe = 20;
        int poDeCafeNecessario = quantidade * quantidadeDePoCafe;
        if (poDeCafeNecessario > this.quantidadePoCafe) {
            return pagamento;
        }

        double valorVenda = ((double) quantidade) * this.precoUnitario;
        if (valorVenda > pagamento) {
            return pagamento;
        }

        this.quantidadePoCafe -= poDeCafeNecessario;
        this.registrarVenda(quantidade, valorVenda);
        return pagamento - valorVenda;
    }

    private void registrarVenda(int quantidade, double pagamento) {
        this.quantidadeCafePreparado += quantidade;
        this.receita += pagamento;
    }

    static private String formatarPreco(double preco) {
        Locale locale = new Locale("pt", "BR");
        NumberFormat decimalFormat = NumberFormat.getNumberInstance(locale);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(2);
        return decimalFormat.format(preco);
    }

    @Override
    public String toString() {
        return "Localização: " + this.localizacao +
                ", Preço do café: " + formatarPreco(this.precoUnitario) +
                ", Pó disponível: " + this.quantidadePoCafe +
                ", Cafés preparados: " + this.quantidadeCafePreparado +
                ", Valor arrecadado: " + formatarPreco(this.receita);
    }
}
