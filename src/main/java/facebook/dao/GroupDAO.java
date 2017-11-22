package facebook.dao;

import facebook.model.Group;

import java.util.List;

public interface GroupDAO {

    List<Group> getAllGroups();
    List<Group> getByName(String name);
    List<Group> getByFollowers(int followers);
}
