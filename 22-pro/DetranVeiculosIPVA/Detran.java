import java.util.ArrayList;
import java.util.stream.Collectors;

public class Detran {

    private String estado;

    private ArrayList<Veiculo> veiculos;

    public Detran(String estado) {
        this.estado = estado;
        this.veiculos = new ArrayList<>();
    }

    public boolean addVeiculo(Veiculo veiculo) {
        if(this.veiculos.contains(veiculo)) return false;
        this.veiculos.add(veiculo);
        return true;
    }

    @Override
    public String toString() {
        return "Estado: " + estado +
                "\n" + this.veiculos.stream()
                                    .map(veiculo -> veiculo.toString() + "\n")
                                    .collect(Collectors.joining());
    }
}
