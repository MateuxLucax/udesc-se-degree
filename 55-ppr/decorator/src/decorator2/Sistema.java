package decorator2;

public class Sistema {
	public static void main(String[] args) {
		PedidoBase pedido = new Pedido(200);
		pedido.concluir();
		System.out.println(pedido.getTotal());
		
		PedidoBase fd = new FreteDecorator(pedido, 1);
		fd.concluir();
		System.out.println(fd.getTotal());
		
		System.out.println();
		PedidoBase whats = new MensagemWhatsDecorator(new FreteDecorator(pedido, 1), "47999810362");
		whats.concluir();
		System.out.println(whats.getTotal());
	}
}
