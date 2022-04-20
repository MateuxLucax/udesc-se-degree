import java.util.ArrayList;
import java.util.stream.Collectors;

public class Companhia {

    private String nome;

    private ArrayList<LinhaTelefonica> linhasTelefonicas;

    public Companhia(String nome) {
        this.nome = nome;
        this.linhasTelefonicas = new ArrayList<>();
    }

    public boolean addLinhaTelefonica(LinhaTelefonica linhaTelefonica) {
        if (this.linhasTelefonicas.contains(linhaTelefonica)) return false;
        this.linhasTelefonicas.add(linhaTelefonica);
        return true;
    }

    public String getArrecadacao() {
        double arrecadacao = this.linhasTelefonicas.stream().mapToDouble(LinhaTelefonica::valorMensalAssinatura).sum();

        return "Companhia: " + nome +
                ", Arreacadação Mensal Fixa: " + String.format("%.1f", arrecadacao);
    }

    @Override
    public String toString() {
        return "Companhia: " + nome +
                this.linhasTelefonicas.stream()
                .map(linhaTelefonica -> "\n" +  linhaTelefonica.toString())
                .collect(Collectors.joining());
    }
}
