package facebook.service.impl;

import facebook.dao.UserDAO;
import facebook.dao.factory.DAOFactory;
import facebook.model.User;
import facebook.service.UserService;

import java.util.List;

/**
 * With DAOFactory pattern calls any methods from UserDAO.
 *
 * If methods with parameters, checks "notNull" or "!=0".
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUsers() {
        UserDAO allUsersMethods = DAOFactory.getUserDAOMethods();
        return allUsersMethods.getAllUsers();
    }

    @Override
    public List<User> getByName(String name) {
        if (name != null) {
            return DAOFactory.getUserDAOMethods().getByName(name);
        }
        return null;
    }

    @Override
    public List<User> getBySurname(String surname) {
        if (surname != null) {
            return DAOFactory.getUserDAOMethods().getBySurname(surname);
        }
        return null;
    }

    @Override
    public List<User> getByAge(int age) {
        if (age > 0) {
            return DAOFactory.getUserDAOMethods().getByAge(age);
        }
        return null;
    }

    @Override
    public List<User> getByMaritalStatus(String status) {
        if (status != null) {
            return DAOFactory.getUserDAOMethods().getByMaritalStatus(status);
        }
        return null;
    }
}
