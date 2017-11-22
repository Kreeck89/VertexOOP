package facebook.service.impl;

import facebook.dao.FriendDAO;
import facebook.dao.factory.DAOFactory;
import facebook.model.Friend;
import facebook.service.FriendService;

import java.util.List;

public class FriendServiceImpl implements FriendService {
    @Override
    public List<Friend> getAllFriends() {
        FriendDAO allFriendsMethods = DAOFactory.getFriendDAOMethods();
        return allFriendsMethods.getAllFriends();
    }

    @Override
    public List<Friend> getByName(String name) {
        if (!name.equals("")) {
            return DAOFactory.getFriendDAOMethods().getByName(name);
        }
        return null;
    }
}
