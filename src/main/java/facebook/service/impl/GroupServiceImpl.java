package facebook.service.impl;

import facebook.dao.GroupDAO;
import facebook.dao.factory.DAOFactory;
import facebook.model.Group;
import facebook.service.GroupService;

import java.util.List;

/**
 * With DAOFactory pattern calls any methods from GroupDAO.
 *
 * If methods with parameters, checks "notNull" or "!=0".
 */
public class GroupServiceImpl implements GroupService {
    @Override
    public List<Group> getAllGroups() {
        GroupDAO allGroupsMethods = DAOFactory.getGroupDAOMethods();
        return allGroupsMethods.getAllGroups();
    }

    @Override
    public List<Group> getByName(String name) {
        if (!name.equals("")) {
            return DAOFactory.getGroupDAOMethods().getByName(name);
        }
        return null;
    }

    @Override
    public List<Group> getByFollowers(int followers) {
        if (followers > 0) {
            return DAOFactory.getGroupDAOMethods().getByFollowers(followers);
        }
        return null;
    }
}
