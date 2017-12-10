package facebook.dao;

import facebook.model.User;

import java.util.List;

public interface UserDAO extends CradDAO<User> {

    List<User> getAllUsers();
    List<User> getByName(String name);
    List<User> getBySurname(String surname);
    List<User> getByAge(int age);
    List<User> getByMaritalStatus(String status);

}
