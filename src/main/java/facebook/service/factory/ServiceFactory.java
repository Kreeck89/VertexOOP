package facebook.service.factory;

import facebook.service.FriendService;
import facebook.service.GroupService;
import facebook.service.PostService;
import facebook.service.UserService;
import facebook.service.impl.FriendServiceImpl;
import facebook.service.impl.GroupServiceImpl;
import facebook.service.impl.PostServiceImpl;
import facebook.service.impl.UserServiceImpl;

/**
 * Pattern for easy uses phoneService.
 * @return different instance of Service-realisations.
 */
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
     * @return instance of {@link GroupServiceImpl}
     */
    public static GroupService getAllGroupsMethods() {
        return new GroupServiceImpl();
    }

    /**
     * @return instance of {@link FriendServiceImpl}
     */
    public static FriendService getAllFriendsMethods() {
        return new FriendServiceImpl();
    }
}
