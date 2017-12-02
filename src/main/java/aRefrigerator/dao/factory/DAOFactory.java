package aRefrigerator.dao.factory;

import aRefrigerator.dao.CondDAO;
import aRefrigerator.dao.impl.CondDAOImpl;

/**
 * Pattern for easy work with Database and Methods of conditioners;
 */
public class DAOFactory {

    /**
     * @return instance of {@link CondDAOImpl}
     */
    public static CondDAO getAllConditionersMethods() {
        return new CondDAOImpl();
    }
}
