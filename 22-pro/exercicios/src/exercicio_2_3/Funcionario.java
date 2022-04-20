package exercicio_2_3;

import java.text.NumberFormat;

public class Funcionario {

    private int matricula;

    private String nome;

    private double salario;

    public Funcionario(int matricula) {
        this.matricula = matricula;
    }

    public boolean setNome(String nome) {
        if(!nome.isEmpty()) {
            this.nome = nome;
            return true;
        }
        return false;
    }

    public boolean setSalarioMensal(double salario) {
        if (salario > 0 && salario != this.salario) {
            this.salario = salario;
            return true;
        }
        return false;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalarioMensal() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "Funcionario - " +
                "matricula: " + this.matricula +
                ", nome: " + this.nome +
                ", salario: " + NumberFormat.getCurrencyInstance().format(this.salario);
    }
}
