package visitor4.personagens;

import visitor4.visitor.RTSVisitor;

public class Catapulta extends Personagem {

	public Catapulta() {
		super(8, 5);
	}

	@Override
	public void accept(RTSVisitor visitor) {
		visitor.visitCatapulta(this);
	}
}
