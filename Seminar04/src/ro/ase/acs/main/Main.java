package ro.ase.acs.main;

import ro.ase.acs.simplefactory.RestApi;
import ro.ase.acs.simplefactory.RestApiFactory;
import ro.ase.acs.simplefactory.RestApiFactoryV2;
import ro.ase.acs.simplefactory.ServerType;
import ro.ase.acs.singleton.Logger;
import ro.ase.acs.singleton.LoggerV2;
import ro.ase.acs.singleton.LoggerV3;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Logger v1");
        Logger.getInstance().log("Logger v1");

        LoggerV2 loggerV2 = LoggerV2.instance;
        loggerV2.log("Logger v2");
        LoggerV2.instance.log("Logger v2");

        LoggerV3 loggerV3 = LoggerV3.INSTANCE;
        loggerV3.log("Logger v3");
        LoggerV3.INSTANCE.log("Logger v3");

        RestApiFactory restApiFactory = new RestApiFactory();
        RestApi restApi = restApiFactory.getRestApi(RestApiFactory.DEVELOPMENT);
        restApi.connect();

        RestApiFactoryV2 restApiFactoryV2 = new RestApiFactoryV2();
        restApi = restApiFactoryV2.getRestApi(ServerType.PROD);
        if(restApi != null) {
            restApi.connect();
        }
    }
}
