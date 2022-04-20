public abstract class LinhaTelefonica {

    private String numero;

    private String proprietario;

    private int anoAquisicao;

    LinhaTelefonica(String numero, String proprietario, int anoAquisicao) {
        this.numero = numero;
        this.proprietario = proprietario;
        this.anoAquisicao = anoAquisicao;
    }

    public String getNumero() {
        return numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public boolean setProprietario(String proprietario) {
        if (this.proprietario.equalsIgnoreCase(proprietario)) return false;
        this.proprietario = proprietario;
        return true;
    }

    public int getAnoAquisicao() {
        return anoAquisicao;
    }

    public boolean setAnoAquisicao(int anoAquisicao) {
        if (anoAquisicao <= 0 || this.anoAquisicao == anoAquisicao) return false;
        this.anoAquisicao = anoAquisicao;
        return true;
    }

    public abstract double valorMensalAssinatura();

    public abstract String toString();
}
