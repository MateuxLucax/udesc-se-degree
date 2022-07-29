package strategy2.loja.venda;

import strategy2.loja.strategy.PoliticaDesconto;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private PoliticaDesconto politicaDesconto;

	public Venda(PoliticaDesconto politicaDesconto) {
		this.politicaDesconto = politicaDesconto;
	}

	public void setPoliticaDesconto(PoliticaDesconto politicaDesconto) {
		this.politicaDesconto = politicaDesconto;
	}

	private final List<ItemVenda> itens = new ArrayList<>();
	
	public void add(ItemVenda item) {
		itens.add(item);
	}
	
	public double getValorTotalBruto() {
		double res = 0;
		for (ItemVenda item:itens)
			res += item.getPrecoUnit()*item.getQtdade();
		return res;
	}
	
	public double getValorTotalAPagar() {
		return getValorTotalBruto();
	}

	public double pagar() {
		return 0; // TODO
	}
	
}
