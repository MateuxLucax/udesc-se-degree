package exercicio_3_4;

public class AlunoEspecial extends Aluno {

    @Override
    public String getEmail() {
        return this.nome.concat(".especial@edu.udesc.br");
    }
}
