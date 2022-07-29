package decorator4;

public class SanduicheDecorator extends Sanduiche {
	private Sanduiche sanduiche;
	
	public SanduicheDecorator(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}

	@Override
	public double getPreco() {
		return sanduiche.getPreco();
	}
}
