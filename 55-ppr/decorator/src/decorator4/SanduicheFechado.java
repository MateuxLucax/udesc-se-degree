package decorator4;

public class SanduicheFechado extends Sanduiche {
	@Override
	public double getPreco() {
		return 1.0;
	}
	
	@Override
	public String toString() {
		return "Sanduíche Fechado: ";
	}
}
