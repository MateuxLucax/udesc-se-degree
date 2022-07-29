package strategy1.strategy;

import strategy1.pedido.ItemPedido;
import strategy1.pedido.Pedido;

public class CalculoSedex implements CalculoFrete {

	@Override
	public double calcular(Pedido pedido) {
		double total = 0;
		for (ItemPedido item:pedido.getItensPedido())
			total += item.getProduto().getPeso();
		return total * 3;
	};

}
