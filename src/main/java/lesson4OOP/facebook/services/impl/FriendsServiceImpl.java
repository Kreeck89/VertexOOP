package lesson4OOP.facebook.services.impl;

import lesson4OOP.facebook.dao.FriendsDao;
import lesson4OOP.facebook.dao.factory.DaoFactory;
import lesson4OOP.facebook.model.Friends;
import lesson4OOP.facebook.services.FriendsService;

import java.util.List;

public class FriendsServiceImpl implements FriendsService {
    @Override
    public List<Friends> getAllFriends() {
        FriendsDao allFriend = DaoFactory.getFriendDaoMethods();
        return allFriend.getAllFriends();
    }

    @Override
    public List<Friends> getByName(String name) {
        if (name != null) {
            return DaoFactory.getFriendDaoMethods().getByName(name);
        }
        return null;
    }
}
