package facebook.dao.factory;

import facebook.dao.FriendDAO;
import facebook.dao.GroupDAO;
import facebook.dao.PostDAO;
import facebook.dao.UserDAO;
import facebook.dao.impl.FriendDAOImpl;
import facebook.dao.impl.GroupDAOImpl;
import facebook.dao.impl.PostDAOImpl;
import facebook.dao.impl.UserDAOImpl;

/**
 * Pattern for easy uses dao.
 * @return different instance of DAO-realisations.
 */
public class DAOFactory {

    /**
     * @return instance of {@link UserDAOImpl}
     */
    public static UserDAO getUserDAOMethods() {
        return new UserDAOImpl();
    }

    /**
     * @return instance of {@link PostDAOImpl}
     */
    public static PostDAO getPostDAOMethods() {
        return new PostDAOImpl();
    }

    /**
     * @return instance of {@link GroupDAOImpl}
     */
    public static GroupDAO getGroupDAOMethods() {
        return new GroupDAOImpl();
    }

    /**
     * @return instance of {@link FriendDAOImpl}
     */
    public static FriendDAO getFriendDAOMethods() {
        return new FriendDAOImpl();
    }
}
