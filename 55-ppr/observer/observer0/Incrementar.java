package observer0;

import java.util.ArrayList;
import java.util.List;

public class Incrementar {

	private final List<ObserverIncrementar> observadores = new ArrayList<>();

	private Incrementar() {
	}

	private static Incrementar instancia;
	
	public static Incrementar getInstancia() {
		if (instancia == null) instancia = new Incrementar();

		return instancia;
	}
	
	private int conta;
	
	public int getConta() {
		return conta;
	}

	public void inc() {
		conta++;
		notificar();
	}

	public void anexar(ObserverIncrementar observador) {
		observadores.add(observador);
	}

	public void desanexar(ObserverIncrementar observador) {
		observadores.remove(observador);
	}

	public void notificar() {
		for (var observador : observadores) {
			observador.incrementado(conta);
		}
	}

}
