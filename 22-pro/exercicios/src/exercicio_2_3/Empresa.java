package exercicio_2_3;

import java.util.ArrayList;

public class Empresa {

    private String cnpj;

    private String razaoSocial;

    private ArrayList<Funcionario> funcionarios;

    public Empresa(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.funcionarios = new ArrayList<>();
    }

    public void imprimeFuncionarios() {
        System.out.println("--- Relação de funcionários ---");
        System.out.println(this.funcionarios.toString());
    }

    public double getDespesasFolhasPagamento() {
        return this.funcionarios.stream().mapToDouble(Funcionario::getSalarioMensal).sum();
    }

    public boolean adicionarFuncionario(Funcionario funcionario) {
        if (this.funcionarios.contains(funcionario)) {
            return false;
        }
        this.funcionarios.add(funcionario);
        return true;
    }
}
