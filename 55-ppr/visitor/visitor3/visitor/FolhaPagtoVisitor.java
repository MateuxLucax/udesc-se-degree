package visitor3.visitor;

import visitor3.empresa.FuncNivelA;
import visitor3.empresa.FuncNivelB;
import visitor3.empresa.Gerente;

public class FolhaPagtoVisitor implements FuncionarioVisitor {

    private double salarioTotal;

    @Override
    public void visitGerente(Gerente gerente) {
        salarioTotal += gerente.getSalario();
    }

    @Override
    public void visitFuncNivelA(FuncNivelA funcionario) {
        salarioTotal += funcionario.getSalario();
    }

    @Override
    public void visitFuncNivelB(FuncNivelB funcionario) {
        salarioTotal += funcionario.getSalario();
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
}
