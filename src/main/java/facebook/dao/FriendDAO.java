package facebook.dao;

import facebook.model.Friend;

import java.util.List;

public interface FriendDAO {

    List<Friend> getAllFriends();
    List<Friend> getByName(String name);
}
