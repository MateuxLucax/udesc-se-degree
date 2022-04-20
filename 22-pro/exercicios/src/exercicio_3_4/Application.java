package exercicio_3_4;

public class Application {

    public static void main(String[] args) {
        Pessoa pes1 = new Aluno();
        pes1.setNome("Bob");
        Pessoa pes2 = new AlunoEspecial();
        pes2.setNome("Alice");
        AlunoEspecial alu1 = new AlunoEspecial();
        alu1.setNome("John");
        Aluno alu2 = new Aluno();
        alu2.setNome("Chris");
        Pessoa pes3 = new Pessoa();
        pes3.setNome("Bia");
        Professor prof1 = new Professor();
        prof1.setNome("Roger");

        System.out.println("14 - " + pes1.getEmail());
        System.out.println("15 - " + pes2.getEmail());
        System.out.println("16 - " + alu1.getEmail());
        System.out.println("17 - " + alu2.getEmail());
        System.out.println("18 - " + pes3.getEmail());
        System.out.println("19 - " + prof1.getEmail());

        pes1 = pes2;
        System.out.println("22 - " + pes1.getEmail());

        pes2 = alu1;
        System.out.println("25 - " + pes2.getEmail());

        pes3 = prof1;
        System.out.println("28 - " + pes3.getEmail());

        alu2 = alu1;
        System.out.println("31 - " + alu2.getEmail());
    }
}
