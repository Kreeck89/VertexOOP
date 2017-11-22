package facebook.service;

import facebook.model.Friend;

import java.util.List;

public interface FriendService {

    List<Friend> getAllFriends();
    List<Friend> getByName(String name);
}
