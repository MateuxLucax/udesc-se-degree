package state4.pedido;

public class Pendente extends PedidoEstado {
	private Pedido pedido;
	
	public Pendente(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void cancelar() throws Exception {
		pedido.setEstado(new Cancelado(pedido));
	}
	
	@Override
	public void retomar() throws Exception {
		pedido.setEstado(new EmAnalise(pedido));
	}
}
