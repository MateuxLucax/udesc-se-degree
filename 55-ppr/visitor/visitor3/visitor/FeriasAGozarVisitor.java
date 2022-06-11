package visitor3.visitor;

import visitor3.empresa.FuncNivelA;
import visitor3.empresa.FuncNivelB;
import visitor3.empresa.Gerente;

public class FeriasAGozarVisitor implements FuncionarioVisitor {

    private int qtdosFuncionarios;

    @Override
    public void visitGerente(Gerente gerente) {
        if (gerente.getFeriasAGozar() >= 10) {
            qtdosFuncionarios++;
            gerente.setFeriasAGozar(gerente.getFeriasAGozar() - 10);
        }
    }

    @Override
    public void visitFuncNivelA(FuncNivelA funcionario) {
        if (funcionario.getFeriasAGozar() >= 10 && funcionario.getSalario() >= 5000) {
            qtdosFuncionarios++;
            funcionario.setFeriasAGozar(funcionario.getFeriasAGozar() - 10);
        }
    }

    @Override
    public void visitFuncNivelB(FuncNivelB funcionario) {
        if (funcionario.getFeriasAGozar() >= 5 && funcionario.getSalario() >= 1500) {
            qtdosFuncionarios++;
            funcionario.setFeriasAGozar(funcionario.getFeriasAGozar() - 5);
        }
    }

    public int getQtdosFuncionarios() {
        return qtdosFuncionarios;
    }
}
