package adapter4.crypto;

public class Crypto implements ICrypto {

    private final ICrypto crypto;

    public Crypto(ICrypto crypto) {
        this.crypto = crypto;
    }

    @Override
    public String encrypt(String message) throws Exception {
        return this.crypto.encrypt(message);
    }
}
