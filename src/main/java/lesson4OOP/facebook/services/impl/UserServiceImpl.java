package lesson4OOP.facebook.services.impl;

import lesson4OOP.facebook.dao.UserDao;
import lesson4OOP.facebook.dao.factory.DaoFactory;
import lesson4OOP.facebook.model.User;
import lesson4OOP.facebook.services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUser() {
        UserDao allUser = DaoFactory.getUserDao();
        return allUser.getAllUsers();
    }

    @Override
    public User getByName(String string) {
        if (string == null) {
            return new User();
        }
            return DaoFactory.getUserDao().getByName(string);
    }
}
