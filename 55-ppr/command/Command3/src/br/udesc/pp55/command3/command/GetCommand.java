package br.udesc.pp55.command3.command;

import br.udesc.pp55.command3.dao.BancoPessoas;
import br.udesc.pp55.command3.modelo.Pessoa;
import br.udesc.pp55.command3.observer.Observer;

public class GetCommand extends Command {
	private int id;
	
	public GetCommand(Observer observer, String[] dados) {
		super(observer);
		this.id = Integer.parseInt(dados[0]);
	}
	
	@Override
	public void execute() {
		Pessoa[] pessoas = BancoPessoas.getInstance().getAll();
		String[][] res = new String[pessoas.length][2];
		for (int i=0; i<pessoas.length; i++) {
			if (pessoas[i].getId() == this.id) {
				res[i][0] = pessoas[i].getId() + "";
				res[i][1] = pessoas[i].getNome();
			}
			
		}
		this.observer.buscouDados(res);
		
	}

	@Override
	public void undo() {
		// Esse Command nao precisa de undo
	}

	@Override
	public void redo() {
		// Esse Command nao precisa de redo
	}
}
