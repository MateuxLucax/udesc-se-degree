package exercicio_3_4;

public class Aluno extends Pessoa {

    @Override
    public String getEmail() {
        return this.nome.concat("@edu.udesc.br");
    }
}
