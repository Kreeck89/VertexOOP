package lesson4OOP.facebook.services.impl;

import lesson4OOP.facebook.dao.UserDao;
import lesson4OOP.facebook.dao.factory.DaoFactory;
import lesson4OOP.facebook.model.User;
import lesson4OOP.facebook.services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUser() {
        UserDao allUser = DaoFactory.getUserDaoMethods();
        return allUser.getAllUsers();
    }

    @Override
    public List<User> getByName(String name) {
        if (name != null) {
            return DaoFactory.getUserDaoMethods().getByName(name);
        }
        return null;
    }

    @Override
    public List<User> getBySurname(String surname) {
        if (surname != null) {
            return DaoFactory.getUserDaoMethods().getBySurname(surname);
        }
        return null;
    }

    @Override
    public List<User> getByAge(int age) {
        if (age > 0) {
            return DaoFactory.getUserDaoMethods().getByAge(age);
        }
        return null;
    }
}
