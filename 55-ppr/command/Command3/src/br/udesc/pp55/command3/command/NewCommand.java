package br.udesc.pp55.command3.command;

import br.udesc.pp55.command3.dao.BancoPessoas;
import br.udesc.pp55.command3.observer.Observer;

public class NewCommand extends Command {
	private int codigo;
	private String nome;

	public NewCommand(Observer observer, String[] dados) {
		super(observer);
		codigo = Integer.parseInt(dados[0]);
		nome = dados[1];
	}

	@Override
	public void execute() {
		int newid = BancoPessoas.getInstance().addPessoa(codigo, nome);
		String mensagem = "Criada pessoa código: " + String.valueOf(newid);
		this.observer.mensagem(mensagem);;
	}

	@Override
	public void undo() {
		BancoPessoas.getInstance().removerPessoa(codigo);
	}

	@Override
	public void redo() {
		BancoPessoas.getInstance().addPessoa(codigo, nome);
	}

}
