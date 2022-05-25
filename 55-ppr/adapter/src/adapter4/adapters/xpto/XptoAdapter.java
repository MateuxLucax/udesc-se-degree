package adapter4.adapters.xpto;

import adapter4.crypto.ICrypto;
import xpto.Authentication;
import xpto.Encrypt;
import xpto.User;

public class XptoAdapter implements ICrypto {

    private final Authentication authentication;
    private final Encrypt encrypt;
    private final User user;
    private final boolean admin;

    public XptoAdapter(adapter4.adapters.xpto.User user, boolean admin) {
        this.authentication = Authentication.getInstance();
        this.encrypt = new Encrypt();
        this.user = new User();
        this.user.setName(user.getPassword());
        this.user.setPassword(user.getPassword());
        this.admin = admin;
    }


    @Override
    public String encrypt(String message) throws Exception {
        if (this.admin) {
            this.authentication.enterAdministrativePrivileges(user);
        } else {
            this.authentication.enterCommonPrivileges(user);
        }
        return this.encrypt.encrypt(message);
    }
}
