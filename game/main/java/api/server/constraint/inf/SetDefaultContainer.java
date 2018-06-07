package api.server.constraint.inf;

import api.server.util.ClassUtil;

import java.util.HashMap;
import java.util.Map;


/**
 * Parameter validation sets the default value of the container
 *
 * @author mc
 */
public class SetDefaultContainer {
    private final static Map<String, SetDefault> container;

    static {
        container = new HashMap<>();
        try {
            for (Class<?> c : ClassUtil.getAllAssignedClass(SetDefault.class)) {
                SetDefault setDefault = (SetDefault) c.newInstance();
                SetDefaultContainer.getInstance().add(setDefault.getAnnotation().getName(), setDefault);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class RequestCommandContainerHolder {
        private static SetDefaultContainer instance = new SetDefaultContainer();
    }

    public static SetDefaultContainer getInstance() {
        return RequestCommandContainerHolder.instance;
    }

    public void add(String type, SetDefault command) {
        container.put(type, command);
    }

    public SetDefault get(String type) {
        return container.get(type);
    }
}
