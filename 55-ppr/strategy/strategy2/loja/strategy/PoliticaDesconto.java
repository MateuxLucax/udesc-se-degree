package strategy2.loja.strategy;

import strategy2.loja.venda.Venda;

public interface PoliticaDesconto {

    double calcular(Venda venda);

}
