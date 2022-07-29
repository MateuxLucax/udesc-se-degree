package decorator2;

public abstract class PedidoDecorator extends PedidoBase {
	private PedidoBase pedido;
	
	public PedidoDecorator(PedidoBase pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void concluir() {
		pedido.concluir();
	}
	
	@Override
	public double getTotal() {
		return pedido.getTotal();
	}
}
