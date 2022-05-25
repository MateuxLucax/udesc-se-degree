package adapter4.adapters.acme;

import acme.Criptografar;
import adapter4.crypto.ICrypto;

public class AcmeAdapter implements ICrypto {

    private final Criptografar criptografar;

    public AcmeAdapter() {
        this.criptografar = new Criptografar();
    }

    @Override
    public String encrypt(String message) throws Exception {
        criptografar.cripto(message);
        return criptografar.getResultadoCriptografia();
    }

}
