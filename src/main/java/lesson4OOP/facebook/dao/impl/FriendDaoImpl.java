package lesson4OOP.facebook.dao.impl;

import lesson4OOP.facebook.dao.FriendsDao;
import lesson4OOP.facebook.data.Database;
import lesson4OOP.facebook.model.Friends;

import java.util.LinkedList;
import java.util.List;

public class FriendDaoImpl  implements FriendsDao {
    @Override
    public List<Friends> getAllFriends() {
        return Database.getAllFriends();
    }

    @Override
    public List<Friends> getByName(String name) {
        List<Friends> listByName = new LinkedList<>();
        List<Friends> allFriends = Database.getAllFriends();
        for (Friends elem : allFriends) {
            if (name.equals(elem.getName())) {
                listByName.add(elem);
            }
        }
        return listByName;
    }
}
