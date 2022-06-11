package visitor4.personagens;

import visitor4.visitor.RTSVisitor;

public class Lanceiro extends Personagem {

	public Lanceiro() {
		super(10, 1);
	}

	@Override
	public void accept(RTSVisitor visitor) {
		visitor.visitLanceiro(this);
	}
}
