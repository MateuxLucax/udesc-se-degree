package adapter2.adapterdeobjeto;

import adapter2.american.AmericanAddress;
import adapter2.brasileiro.CorreiosValidador;
import adapter2.cliente.Cliente;
import adapter2.cliente.ValidadorEndereco;

public class UPSDeObjeto implements ValidadorEndereco {

    private final AmericanAddress validador;

    public UPSDeObjeto() {
        this.validador = new AmericanAddress();
    }

    @Override
    public void validar(Cliente cliente) throws Exception {
        System.out.println("Validação com Correios");
        if (!validador.validate(cliente.getEndereco(), cliente.getCep(), cliente.getEstado()))
            throw new Exception("Endereço inválido");
    }
}
