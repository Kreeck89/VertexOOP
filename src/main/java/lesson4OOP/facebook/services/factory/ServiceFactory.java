package lesson4OOP.facebook.services.factory;

import lesson4OOP.facebook.services.FriendsService;
import lesson4OOP.facebook.services.PostService;
import lesson4OOP.facebook.services.UserService;
import lesson4OOP.facebook.services.impl.FriendsServiceImpl;
import lesson4OOP.facebook.services.impl.PostServiceImpl;
import lesson4OOP.facebook.services.impl.UserServiceImpl;

public class ServiceFactory {

    /**
     * @return instance of {@link UserServiceImpl}
     */
    public static UserService getAllUsersMethods() {
        return new UserServiceImpl();
    }

    /**
     * @return instance of {@link PostServiceImpl}
     */
    public static PostService getAllPostsMethods() {
        return new PostServiceImpl();
    }

    /**
     * @return instance of {@link FriendsServiceImpl}
     */
    public static FriendsService getAllFriendsMethods() {
        return new FriendsServiceImpl();
    }
}
