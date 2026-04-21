package ro.ase.acs.proxy;

public class AuthenticationService implements AbstractAuthenticationService {
    private String adminUsername = "admin";
    private String adminPassword = "admin";

    @Override
    public boolean login(String username, String password) {
        return username.equals(adminUsername) && password.equals(adminPassword);
    }
}
