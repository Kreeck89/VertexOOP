package lesson4OOP.facebook.dao.impl;

import lesson4OOP.facebook.dao.FriendsDao;
import lesson4OOP.facebook.data.Database;
import lesson4OOP.facebook.model.Friends;

import java.util.List;

public class FriendDaoImpl  implements FriendsDao {
    @Override
    public List<Friends> getAllFriends() {
        return Database.getAllFriends();
    }
}
