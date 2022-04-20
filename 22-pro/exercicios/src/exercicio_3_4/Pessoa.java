package exercicio_3_4;

public class Pessoa {

    protected String nome;

    public String getEmail() {
        return this.nome.concat("@udesc.br");
    }

    public boolean setNome(String nome) {
        if (nome.isEmpty() || nome.equalsIgnoreCase(this.nome)) {
            return false;
        }
        this.nome = nome;
        return true;
    }
}
