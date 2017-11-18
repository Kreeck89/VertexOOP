package lesson4OOP.facebook.dao.impl;

import lesson4OOP.facebook.dao.UserDao;
import lesson4OOP.facebook.data.Database;
import lesson4OOP.facebook.model.User;

import java.util.LinkedList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getAllUsers() {
        return Database.getAllUsers();
    }

    @Override
    public List<User> getByName(String name) {
        List<User> listByName = new LinkedList<>();
        List<User> allUsers = Database.getAllUsers();
        for (User elem : allUsers) {
            if (name.equals(elem.getName())) {
                listByName.add(elem);
            }
        }
        return listByName;
    }

    @Override
    public List<User> getBySurname(String surname) {
        List<User> listBySurname = new LinkedList<>();
        List<User> allUsers = Database.getAllUsers();
        for (User elem : allUsers) {
            if (surname.equals(elem.getSurname())) {
                listBySurname.add(elem);
            }
        }
        return listBySurname;
    }

    @Override
    public List<User> getByAge(int age) {
        List<User> listByAge = new LinkedList<>();
        List<User> allUsers = Database.getAllUsers();
        for (User elem : allUsers) {
            if (age == elem.getAge()) {
                listByAge.add(elem);
            }
        }
        return listByAge;
    }
}
