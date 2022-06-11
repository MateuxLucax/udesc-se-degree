package visitor4.personagens;

import visitor4.visitor.RTSVisitor;

public class Arqueiro extends Personagem {

	public Arqueiro() {
		super(15, 2);
	}

	@Override
	public void accept(RTSVisitor visitor) {
		visitor.visitArqueiro(this);
	}
}
