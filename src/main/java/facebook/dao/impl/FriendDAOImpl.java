package facebook.dao.impl;

import facebook.dao.FriendDAO;
import facebook.data.Database;
import facebook.model.Friend;

import java.util.LinkedList;
import java.util.List;

/**
 * Have some methods for return lists by parameters called from Database.
 *
 * "getAllFriends" returns list with all friends from database;
 * "getByName" returns list with all friends, who have equals Name;
 */
public class FriendDAOImpl implements FriendDAO {
    @Override
    public List<Friend> getAllFriends() {
        return Database.getAllFriends();
    }

    @Override
    public List<Friend> getByName(String name) {
        List<Friend> list = Database.getAllFriends();
        List<Friend> listByName = new LinkedList<>();
        for (Friend elem : list) {
            if (name.equals(elem.getNameFriend())) {
                listByName.add(elem);
            }
        }
        return listByName;
    }
}
