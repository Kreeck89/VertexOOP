package facebook.service;

import facebook.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    List<User> getByName(String name);
    List<User> getBySurname(String surname);
    List<User> getByAge(int age);
    List<User> getByMaritalStatus(String status);
}
