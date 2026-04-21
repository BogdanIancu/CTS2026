package ro.ase.acs.proxy;

public class AuthenticationProxy implements AbstractAuthenticationService {
    private final AbstractAuthenticationService authenticationService;
    private int noOfFailedAttempts = 0;
    private static final int MAX_NUMBER_OF_FAILED_ATTEMPTS = 5;

    public AuthenticationProxy(AbstractAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @Override
    public boolean login(String username, String password) {
        if (noOfFailedAttempts >= MAX_NUMBER_OF_FAILED_ATTEMPTS) {
            return false;
        }
        boolean isSuccessful = authenticationService.login(username, password);
        if (isSuccessful) {
            noOfFailedAttempts = 0;
            return true;
        } else {
            noOfFailedAttempts++;
            return false;
        }
    }
}
