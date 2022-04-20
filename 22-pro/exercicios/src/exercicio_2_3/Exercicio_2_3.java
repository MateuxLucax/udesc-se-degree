package exercicio_2_3;

public class Exercicio_2_3 {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1);
        funcionario1.setNome("Carlos");
        funcionario1.setSalarioMensal(2500);

        Funcionario funcionario2 = new Funcionario(2);
        funcionario2.setNome("Pedro");
        funcionario2.setSalarioMensal(1500);

        Empresa empresa = new Empresa("98123677-40", "Empresa");
        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);

        empresa.imprimeFuncionarios();
        System.out.println(empresa.getDespesasFolhasPagamento());
    }
}
