package lesson4OOP.facebook.dao.impl;

import lesson4OOP.facebook.dao.UserDao;
import lesson4OOP.facebook.data.Database;
import lesson4OOP.facebook.model.User;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getAllUsers() {
        return Database.getAllUsers();
    }

    @Override
    public User getByName(String name) {
        List<User> allUsers = Database.getAllUsers();
        for (User elem : allUsers) {
            if (name.equals(elem.getName())) {
                return elem;
            }
        }
        return null;
    }
}
