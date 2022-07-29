package strategy3.jogo;

import strategy3.strategy.Caminhar;
import strategy3.strategy.Movimentacao;

public class Mecha {

	private int x = 0;
	private int y = 0;
	private Movimentacao movimentacao = new Caminhar();

	public Mecha() {}

	public Mecha(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setMovimentacao(Movimentacao movimentacao) {
		this.movimentacao = movimentacao;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void mover(int x, int y) throws Exception {
		this.x = x;
		this.y = y;
		movimentacao.mover(this);
	}
	
}
