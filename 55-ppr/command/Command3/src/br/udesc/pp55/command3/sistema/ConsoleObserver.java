package br.udesc.pp55.command3.sistema;

import br.udesc.pp55.command3.observer.Observer;

public class ConsoleObserver implements Observer {

	@Override
	public void buscouDados(String[][] dados) {
		for (String[] umDados: dados) {
			if (umDados[0] != null)
				System.out.println(umDados[0] + " " + umDados[1]);
		}
		
	}

	@Override
	public void mensagem(String mensagem) {
		System.out.println(mensagem);
		
	}

}
