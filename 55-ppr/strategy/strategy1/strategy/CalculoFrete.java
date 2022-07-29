package strategy1.strategy;

import strategy1.pedido.Pedido;

public interface CalculoFrete {

	double calcular(Pedido pedido) throws Exception;
	
}
