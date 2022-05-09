package br.udesc.ppr55.command0;

public class tamMusicaCommand implements Command {

	
	private CarrinhoCompras cc;

	public tamMusicaCommand(CarrinhoCompras cc) {
		this.cc = cc;
	}

	@Override
	public void execute() throws Exception {
		int tamTotal = 0;
		for (Musica mus:cc.getProdutos()) {
			tamTotal += mus.getTamanho();
		}
		System.out.println("> " + tamTotal + " MB");
	}

}
