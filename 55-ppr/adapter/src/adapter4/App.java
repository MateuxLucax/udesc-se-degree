package adapter4;

import adapter4.adapters.acme.AcmeAdapter;
import adapter4.adapters.xpto.User;
import adapter4.adapters.xpto.XptoAdapter;
import adapter4.crypto.Crypto;
import adapter4.crypto.ICrypto;

public class App {

    public static void main(String[] args) throws Exception {

        ICrypto acmeCrypto = new Crypto(new AcmeAdapter());
        System.out.println("Cripto com Acme: " + acmeCrypto.encrypt("ablablue"));

        ICrypto xptoCryptoAdm = new Crypto(new XptoAdapter(new User("Admin", "Admin"), true));
        System.out.println("Cripto adm com Xpto: " + xptoCryptoAdm.encrypt("ablablue"));

        ICrypto xptoCrypto = new Crypto(new XptoAdapter(new User("us1", "us1"), false));
        System.out.println("Cripto nao adm com Xpto: " + xptoCrypto.encrypt("ablablue"));
    }

}
