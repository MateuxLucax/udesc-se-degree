package adapter2.adapterdeclasse;

import adapter2.american.AmericanAddress;
import adapter2.cliente.Cliente;
import adapter2.cliente.ValidadorEndereco;

public class UPSDeClasse extends AmericanAddress implements ValidadorEndereco {

    @Override
    public void validar(Cliente cliente) throws Exception {
        System.out.println("Validação com UPS");
        if (super.validate(cliente.getEndereco(), cliente.getCep(), cliente.getEstado()))
            throw new Exception("Endereço inválido");
    }
}
