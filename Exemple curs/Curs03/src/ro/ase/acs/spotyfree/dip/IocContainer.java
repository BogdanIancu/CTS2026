package ro.ase.acs.spotyfree.dip;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class IocContainer {
    private Map<Class, Class> container = new HashMap();

    public void register(Class contract, Class implementation) {
        container.put(contract, implementation);
    }

    public void initialize(Object instance) {
        for (Field f : instance.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(Bean.class)) {
                try {
                    f.setAccessible(true);
                    Class<?> implementation = container.get(f.getType());
                    f.set(instance, implementation.getConstructor().newInstance());
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
