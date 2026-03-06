package ro.ase.acs.spotyfree.dip;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private Map<Class, Class> repo = new HashMap();

    public void register(Class contract, Class implementation) {
        repo.put(contract, implementation);
    }

    public<T> T resolve(Class contract) {
        Class implementation = repo.get(contract);
        try {
            return (T)implementation.getConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
