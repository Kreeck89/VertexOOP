package facebook.service;

import facebook.model.Group;

import java.util.List;

public interface GroupService extends CradService<Group> {

    List<Group> getAllGroups();
    List<Group> getByName(String name);
    List<Group> getByFollowers(int followers);

}
