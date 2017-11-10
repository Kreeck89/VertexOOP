package lesson4OOP.facebook.services.impl;

import lesson4OOP.facebook.dao.UserDao;
import lesson4OOP.facebook.dao.impl.UserDaoImpl;
import lesson4OOP.facebook.model.User;
import lesson4OOP.facebook.services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUser() {
        UserDao userDao = new UserDaoImpl();
        return userDao.getAllUsers();
    }
}
