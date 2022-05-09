package prototype02.jogo;

public class Ogro extends Inimigo implements Cloneable {

	private int forcaAtaque;

	public Ogro(int forcaAtaque) {
		super(100, 5);
		
		this.forcaAtaque = forcaAtaque;
	}

	@Override
	public int atacar() {
		return forcaAtaque;
	}

	@Override
	public String toString() {
		return super.toString() + "[" + forcaAtaque + "]";
	}

//	@Override
//	public Inimigo clonar() throws Exception {
//		return (Inimigo) this.clone();
//	}
}
