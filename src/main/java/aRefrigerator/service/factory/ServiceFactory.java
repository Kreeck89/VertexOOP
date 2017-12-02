package aRefrigerator.service.factory;

import aRefrigerator.service.CondService;
import aRefrigerator.service.impl.CondServiceImpl;

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
