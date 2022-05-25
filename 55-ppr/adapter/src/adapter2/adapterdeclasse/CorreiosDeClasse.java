package adapter2.adapterdeclasse;

import adapter2.cliente.Cliente;
import adapter2.cliente.CorreiosValidadorPorClasse;
import adapter2.cliente.ValidadorEndereco;

public class CorreiosDeClasse extends CorreiosValidadorPorClasse implements ValidadorEndereco {

    @Override
    public void validar(Cliente cliente) throws Exception {
        System.out.println("Validação com Correios");
        super.validar(cliente);
    }

}
