package facebook.service.factory;

import facebook.service.FriendService;
import facebook.service.GroupService;
import facebook.service.PostService;
import facebook.service.UserService;
import facebook.service.impl.FriendServiceImpl;
import facebook.service.impl.GroupServiceImpl;
import facebook.service.impl.PostServiceImpl;
import facebook.service.impl.UserSericeImpl;

public class ServiceFactory {

    /**
     * @return instance of {@link UserSericeImpl}
     */
    public static UserService getAllUsersMethods() {
        return new UserSericeImpl();
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
