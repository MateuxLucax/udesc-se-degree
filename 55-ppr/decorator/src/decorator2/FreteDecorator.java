package decorator2;

public class FreteDecorator extends PedidoDecorator {
//	STRATEGY Poderia enviar um objeto para cálculo do frete
	private int tipoFrete;
	
	public FreteDecorator(PedidoBase pedido, int tipoFrete) {
		super(pedido);
		this.tipoFrete = tipoFrete;
	}

	@Override
	public void concluir() {
		super.concluir();
		if (tipoFrete == 1) {
			System.out.println("Comunicando com os correios");
		} else {
			System.out.println("Comunicando com a transportadora");
		}
	}

	@Override
	public double getTotal() {
		double total = super.getTotal();
		if (tipoFrete == 1) {
			total += 40;
		} else {
			total += 30;
		}
		return total;
	}
}
