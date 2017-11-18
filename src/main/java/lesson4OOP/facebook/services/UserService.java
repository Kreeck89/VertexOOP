package lesson4OOP.facebook.services;

import lesson4OOP.facebook.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    List<User> getByName(String name);
    List<User> getBySurname(String surname);
    List<User> getByAge(int age);
}
