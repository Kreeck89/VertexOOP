package lesson4OOP.facebook.dao;

import lesson4OOP.facebook.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    List<User> getByName(String name);
    List<User> getBySurname(String surname);
    List<User> getByAge(int age);
}
