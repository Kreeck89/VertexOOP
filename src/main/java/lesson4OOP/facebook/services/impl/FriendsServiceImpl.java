package lesson4OOP.facebook.services.impl;

import lesson4OOP.facebook.dao.FriendsDao;
import lesson4OOP.facebook.dao.impl.FriendDaoImpl;
import lesson4OOP.facebook.model.Friends;
import lesson4OOP.facebook.services.FriendsService;

import java.util.List;

public class FriendsServiceImpl implements FriendsService {
    @Override
    public List<Friends> getAllFriends() {
        FriendsDao friendsDao = new FriendDaoImpl();
        return friendsDao.getAllFriends();
    }
}
