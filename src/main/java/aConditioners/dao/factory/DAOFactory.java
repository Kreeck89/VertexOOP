package aConditioners.dao.factory;

import aConditioners.dao.CondDAO;
import aConditioners.dao.impl.CondDAOImpl;

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
