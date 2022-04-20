public class LinhaComercial extends LinhaTelefonica {

    private int quantidadeRamais;

    public LinhaComercial(String numero, String proprietario, int anoAquisicao, int quantidadeRamais) {
        super(numero, proprietario, anoAquisicao);
        this.quantidadeRamais = quantidadeRamais;
    }

    public int getQuantidadeRamais() {
        return quantidadeRamais;
    }

    public boolean setQuantidadeRamais(int quantidadeRamais) {
        if (quantidadeRamais < 0 || this.quantidadeRamais == quantidadeRamais) return false;
        this.quantidadeRamais = quantidadeRamais;
        return true;
    }

    @Override
    public double valorMensalAssinatura() {
        double valorMensal = 0;

        if (getAnoAquisicao() < 2000) {
            valorMensal = 55;
        } else {
            valorMensal = 75;
        }

        if (this.quantidadeRamais > 0) {
            valorMensal += (quantidadeRamais * 8.75);
        }

        return valorMensal;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() +
                ", Proprietario: " + getProprietario() +
                ", Ano: " + getAnoAquisicao() +
                ", Ramais: " + quantidadeRamais +
                ", Valor fixo mensal: " + String.format("%.1f", valorMensalAssinatura());
    }
}
