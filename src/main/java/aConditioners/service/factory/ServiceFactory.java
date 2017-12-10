package aConditioners.service.factory;

import aConditioners.service.CondService;
import aConditioners.service.impl.CondServiceImpl;

/**
 * Some Pattern for easy work with Conditioners from CondController() class;
 */
public class ServiceFactory {

    /**
     * @return instance of {@link CondServiceImpl}
     */
    public static CondService getAllConditionerMethods() {
        return new CondServiceImpl();
    }
}
