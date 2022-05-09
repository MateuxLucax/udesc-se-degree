package br.udesc.ppr55.command0;

public class AddCarrinhoCommand implements Command {
	private CarrinhoCompras cc;
	private int opMusica;

	public AddCarrinhoCommand(CarrinhoCompras cc, int opMusica) {
		this.cc = cc;
		this.opMusica = opMusica;
	}
	
	@Override
	public void execute() throws Exception {
		Musica m = BancoMusicas.getInstancia().getMusicas().get(opMusica);
		cc.add(m);
	}

}
