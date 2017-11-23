package facebook.dao.impl;

import facebook.dao.GroupDAO;
import facebook.data.Database;
import facebook.model.Group;

import java.util.LinkedList;
import java.util.List;

/**
 * Have some methods for return lists by parameters called from Database.
 *
 * "getAllGroups" returns list with all groups from database;
 * "getByName" returns list with all groups, who have equals Name;
 * "getByFollowers" returns list with all groups, who have followers under followers-parameter received;
 */
public class GroupDAOImpl implements GroupDAO {


    @Override
    public List<Group> getAllGroups() {
        return Database.getAllGroups();
    }

    @Override
    public List<Group> getByName(String name) {
        List<Group> list = Database.getAllGroups();
        List<Group> listByName = new LinkedList<>();
        for (Group elem : list) {
            if (name.equals(elem.getNameGroup())) {
                listByName.add(elem);
            }
        }
        return listByName;
    }

    @Override
    public List<Group> getByFollowers(int followers) {
        List<Group> list = Database.getAllGroups();
        List<Group> listByFollowers = new LinkedList<>();
        for (Group elem : list) {
            if (elem.getFollowers() > followers) {
                listByFollowers.add(elem);
            }
        }
        return listByFollowers;
    }
}
