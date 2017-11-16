package lesson4OOP.facebook.dao;

import lesson4OOP.facebook.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getByName(String name);
}
