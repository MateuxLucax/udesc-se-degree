package strategy2.loja.strategy;

import strategy2.loja.venda.Venda;

public class Politica1 implements PoliticaDesconto {


    @Override
    public double calcular(Venda venda) {
        return 0;
    }
}
