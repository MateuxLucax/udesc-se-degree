package state4.pedido;

public class Aprovado extends PedidoEstado {
	private Pedido pedido;
	
	public Aprovado(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void cancelar() throws Exception {
		pedido.setEstado(new Cancelado(pedido));
	}
	
	@Override
	public void atender() throws Exception {
		pedido.setEstado(new Atendido(pedido));
	}
}
