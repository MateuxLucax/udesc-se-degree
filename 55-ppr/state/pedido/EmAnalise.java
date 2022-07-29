package state4.pedido;

public class EmAnalise extends PedidoEstado {
	private Pedido pedido;
	
	public EmAnalise(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void aprovar() throws Exception {
		pedido.setEstado(new Aprovado(pedido));
	}
	
	@Override
	public void cancelar() throws Exception {
		pedido.setEstado(new Cancelado(pedido));
	}
	
	@Override
	public void suspender() throws Exception {
		pedido.setEstado(new Pendente(pedido));
	}
}
