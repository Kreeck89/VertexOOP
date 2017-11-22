package facebook.service;

import facebook.model.Group;

import java.util.List;

public interface GroupService {

    List<Group> getAllGroups();
    List<Group> getByName(String name);
    List<Group> getByFollowers(int followers);
}
