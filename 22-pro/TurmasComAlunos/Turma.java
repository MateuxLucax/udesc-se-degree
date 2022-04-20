import java.util.ArrayList;

public class Turma {
    private String nomeDisciplina;
    private String nomeProfessor;
    private ArrayList<Aluno> alunos;
    public Turma(String nomeDisciplina, String nomeProfessor) { 
        this.nomeDisciplina = nomeDisciplina;
        this.nomeProfessor = nomeProfessor;
        this.alunos = new ArrayList<Aluno>();
    }
    
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public int getQuantidadeAlunos() {
        return this.alunos.size();
    }
    
    public void imprimeAlunos() {
        System.out.printf("Nome da disciplina: %s \n", this.nomeDisciplina);
        System.out.printf("Nome do professor: %s \n", this.nomeDisciplina);
        
        for (Aluno aluno : this.alunos) {
            System.out.printf("  Aluno: nome: %s; matricula: %d \n", aluno.getNome(), aluno.getMatricula());
        }
    }
}
