package state4.pedido;

public class Cancelado extends PedidoEstado {
	private Pedido pedido;
	
	public Cancelado(Pedido pedido) {
		this.pedido = pedido;
	}
}
