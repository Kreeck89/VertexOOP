package lesson4OOP.facebook.dao.factory;

import lesson4OOP.facebook.dao.FriendsDao;
import lesson4OOP.facebook.dao.PostDao;
import lesson4OOP.facebook.dao.UserDao;
import lesson4OOP.facebook.dao.impl.FriendDaoImpl;
import lesson4OOP.facebook.dao.impl.PostDaoImpl;
import lesson4OOP.facebook.dao.impl.UserDaoImpl;

public class DaoFactory {

    /**
     * @return instance of {@link UserDaoImpl}
     */
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

    /**
     * @return instance of {@link PostDaoImpl}
     */
    public static PostDao getPostDao() {
        return new PostDaoImpl();
    }

    /**
     * @return instance of {@link FriendDaoImpl}
     */
    public static FriendsDao getFriendDao() {
        return new FriendDaoImpl();
    }
}