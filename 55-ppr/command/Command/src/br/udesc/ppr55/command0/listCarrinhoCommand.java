package br.udesc.ppr55.command0;

public class listCarrinhoCommand implements Command {
	private CarrinhoCompras cc;

	public listCarrinhoCommand(CarrinhoCompras cc) {
		this.cc = cc;
	}

	@Override
	public void execute() throws Exception {
		for (Musica mus: this.cc.getProdutos()) {
			System.out.println("> " + mus);
		}
		
	}
}
