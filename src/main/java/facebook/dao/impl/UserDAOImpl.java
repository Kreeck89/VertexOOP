package facebook.dao.impl;

import facebook.dao.UserDAO;
import facebook.data.Database;
import facebook.model.User;

import java.util.LinkedList;
import java.util.List;

/**
 * Have some methods for return lists by parameters called from Database.
 *
 * "getAllUser" returns list with all users from database;
 * "getByName" returns list with all users, who have equals Name;
 * "getBySurname" returns list with all users, who have equals Surname;
 * "getByAge" returns list with all users, who have = age;
 * "getByMaritalStatus" returns list with all users, who have equals Status.
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public List<User> getAllUsers() {
        return Database.getAllUsers();
    }

    @Override
    public List<User> getByName(String name) {
        List<User> list = Database.getAllUsers();
        List<User> listByName = new LinkedList<>();
        for (User elem : list) {
            if (name.equals(elem.getName())) {
                listByName.add(elem);
            }
        }
        return listByName;
    }

    @Override
    public List<User> getBySurname(String surname) {
        List<User> list = Database.getAllUsers();
        List<User> listBySurname = new LinkedList<>();
        for (User elem : list) {
            if (surname.equals(elem.getSurname())) {
                listBySurname.add(elem);
            }
        }
        return listBySurname;
    }

    @Override
    public List<User> getByAge(int age) {
        List<User> list = Database.getAllUsers();
        List<User> listByAge = new LinkedList<>();
        for (User elem : list) {
            if (age == elem.getAge()) {
                listByAge.add(elem);
            }
        }
        return listByAge;
    }

    @Override
    public List<User> getByMaritalStatus(String status) {
        List<User> list = Database.getAllUsers();
        List<User> listByMaritalStatus = new LinkedList<>();
        for (User elem : list) {
            if (status.equals(elem.getMaritalStatus())) {
                listByMaritalStatus.add(elem);
            }
        }
        return listByMaritalStatus;
    }
}
