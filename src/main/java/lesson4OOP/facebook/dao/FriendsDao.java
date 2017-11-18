package lesson4OOP.facebook.dao;

import lesson4OOP.facebook.model.Friends;

import java.util.List;

public interface FriendsDao {

    List<Friends> getAllFriends();

    List<Friends> getByName(String name);
}
