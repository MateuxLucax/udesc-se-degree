package visitor3.empresa;

import visitor3.visitor.FuncionarioVisitor;

import java.util.HashSet;
import java.util.Set;

public class Setor {

	// usei set para garantir que não existam funcionarios repetidos
	private final Set<Funcionario> funcionarios = new HashSet<>();
	
	public void add(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	private Gerente gerente;
	
	public Gerente getGerente() {
		return gerente;
	}
	
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
		funcionarios.add(gerente);
	}

	public void accept(FuncionarioVisitor visitor) {
		for (Funcionario funcionario:funcionarios)
			funcionario.accept(visitor);
	}
}
