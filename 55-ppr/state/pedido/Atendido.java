package state4.pedido;

public class Atendido extends PedidoEstado {
	private Pedido pedido;
	
	public Atendido(Pedido pedido) {
		this.pedido = pedido;
	}
}
