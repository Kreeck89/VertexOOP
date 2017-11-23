package facebook.controller;

import facebook.model.Friend;
import facebook.service.FriendService;
import facebook.service.factory.ServiceFactory;

import java.util.List;

/**
 * Implementation of any methods from {@link FriendService}
 */
public class FriendController {

    public static void main(String[] args) {

        FriendService allFriendMethods = ServiceFactory.getAllFriendsMethods();
        for (Friend elem : allFriendMethods.getAllFriends()) {
            System.out.println(elem);
            System.out.println();
        }

        String name = "Valera";
        List<Friend> listByFriend = allFriendMethods.getByName(name);
        for (Friend elem : listByFriend) {
            System.out.println(elem);
        }
    }
}
