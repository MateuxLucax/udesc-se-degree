package adapter2.adapterdeobjeto;

import adapter2.brasileiro.CorreiosValidador;
import adapter2.cliente.Cliente;
import adapter2.cliente.ValidadorEndereco;

public class CorreiosDeObjeto implements ValidadorEndereco {

    private final CorreiosValidador validador;

    public CorreiosDeObjeto() {
        this.validador = new CorreiosValidador();
    }

    @Override
    public void validar(Cliente cliente) throws Exception {
        System.out.println("Validação com Correios");
        validador.validar(cliente.getEstado(), cliente.getEstado());
    }
}
