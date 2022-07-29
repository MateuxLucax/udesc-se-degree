package strategy1;

import strategy1.pedido.ItemPedido;
import strategy1.pedido.Pedido;
import strategy1.pedido.Produto;
import strategy1.strategy.CalculoSedex;
import strategy1.strategy.CalculoTransportadora;

public class Sistema {

	public static void main(String[] args) throws Exception {
		Produto p1 = new Produto("Chocolate", 0.1, 0.01);
		Produto p2 = new Produto("Leite", 1, 0.3);
		
		Pedido p = new Pedido(new CalculoSedex());
		p.addItemPedido(new ItemPedido(p1, 10, 0.9));
		p.addItemPedido(new ItemPedido(p2, 24, 1.5));
		
		System.out.println(p.calcularFrete());
		
		p.setCalculoFrete(new CalculoTransportadora());
		System.out.println(p.calcularFrete());
	}

}
