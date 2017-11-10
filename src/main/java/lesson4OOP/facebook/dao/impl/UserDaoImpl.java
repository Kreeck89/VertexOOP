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
}
