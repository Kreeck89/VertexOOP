package facebook.dao;

import facebook.model.Group;

import java.util.List;

public interface GroupDAO extends CradDAO<Group> {

    List<Group> getAllGroups();
    List<Group> getByName(String name);
    List<Group> getByFollowers(int followers);

}
