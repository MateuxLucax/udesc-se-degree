package prova3.questao3;

import java.text.DecimalFormat;

public class LinhaResidencial extends LinhaTelefonica {

    private int minutosFranquia;

    public LinhaResidencial(String numero, String proprietario, int anoAquisicao, int minutosFranquia) {
        super(numero, proprietario, anoAquisicao);
        this.minutosFranquia = minutosFranquia;
    }

    public int getMinutosFranquia() {
        return minutosFranquia;
    }

    public boolean setMinutosFranquia(int minutosFranquia) {
        if (minutosFranquia <= 0 || this.minutosFranquia == minutosFranquia) return false;
        this.minutosFranquia = minutosFranquia;
        return true;
    }

    @Override
    public double valorMensalAssinatura() {
        double valorMensal = 0;

        if (getAnoAquisicao() < 2000) {
            valorMensal = 40;
        } else {
            valorMensal = 60;
        }

        if (this.minutosFranquia > 100) {
            valorMensal += ((this.minutosFranquia - 100) * 0.1);
        }

        return valorMensal;
    }

    @Override
    public String toString() {
        return "Numero: " + getNumero() +
                ", Proprietario: " + getProprietario() +
                ", Ano: " + getAnoAquisicao() +
                ", Franquia: " + minutosFranquia +
                ", Valor fixo mensal: " + String.format("%.1f", valorMensalAssinatura());
    }
}
