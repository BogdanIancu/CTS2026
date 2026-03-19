package ro.ase.acs.simplefactory;

public class RestApiFactoryV2 {
    public RestApi getRestApi(ServerType serverType) {
        return switch (serverType) {
            case DEV -> new RestApiDevelopment();
            case PROD -> new RestApiProduction();
            default -> null;
        };
    }
}
