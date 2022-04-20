package exercicio_3_2;

public class Exercicio_3_2 {
    public static void main(String[] args) {
        Pessoa p1 = new Aluno();
        Pessoa p2 = new AlunoEspecial();
//        AlunoEspecial ae1 = new Aluno();
//        Professor pf1 = new Pessoa();
        Aluno a1 = new AlunoEspecial();
        Object o1 = new Professor();
//        a1 = p1;
//        a1 = p2;
        p1 = a1;
//        pf1 = a1;
//        a1 = ae1;
        o1 = p1;
//        pf1 = o1;
//        pf1 = a1;
//        ae1 = a1;
        o1 = p1;
//        pf1 = o1;
    }
}
