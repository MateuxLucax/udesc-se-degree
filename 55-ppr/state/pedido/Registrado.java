package state4.pedido;

public class Registrado extends PedidoEstado {
	private Pedido pedido;
	
	public Registrado(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void analisar() throws Exception {
		pedido.setEstado(new EmAnalise(pedido));
	}
}
