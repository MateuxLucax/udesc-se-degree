package br.udesc.pp55.command3.command;

import br.udesc.pp55.command3.dao.BancoPessoas;
import br.udesc.pp55.command3.modelo.Pessoa;
import br.udesc.pp55.command3.observer.Observer;

public class DeleteCommand extends Command {
	private int id;
	private Pessoa pessoa;

	public DeleteCommand(Observer observer, String[] dados) {
		super(observer);
		this.id = Integer.parseInt(dados[0]);
	}

	@Override
	public void execute() {
		this.pessoa = BancoPessoas.getInstance().getPessoa(id);
		BancoPessoas.getInstance().removerPessoa(this.pessoa.getId());
		
		String mensagem = "Deletado o usuário: " + this.pessoa.getId();
		this.observer.mensagem(mensagem);
	}

	@Override
	public void undo() {
		BancoPessoas.getInstance().addPessoa(this.pessoa.getId(), this.pessoa.getNome());
	}

	@Override
	public void redo() {
		BancoPessoas.getInstance().removerPessoa(this.pessoa.getId());	
	}
}
