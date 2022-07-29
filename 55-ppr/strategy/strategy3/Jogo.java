package strategy3;
import strategy3.jogo.Mecha;
import strategy3.strategy.Caminhar;
import strategy3.strategy.Voar;

public class Jogo {

	public static void main(String[] args) throws Exception {
		System.out.println("Começou");

		Mecha m1 = new Mecha();

		m1.mover(10, 30);
		m1.mover(20, 40);

		m1.setMovimentacao(new Voar());

		m1.mover(40, 70);
		m1.mover(90, 130);
	}

}
