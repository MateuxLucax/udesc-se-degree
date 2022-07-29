package decorator2;

public class MensagemWhatsDecorator extends PedidoDecorator {
	private String numeroTelefone;
	public MensagemWhatsDecorator(PedidoBase pedido, String numeroTelefone) {
		super(pedido);
		this.numeroTelefone = numeroTelefone;
		
	}
	
	@Override
	public void concluir() {
		super.concluir();
		System.out.println("Mensagem para: " + numeroTelefone + " - Pedido concluído por " + getTotal());
	}

}
