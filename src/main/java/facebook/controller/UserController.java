package facebook.controller;

import facebook.model.User;
import facebook.service.UserService;
import facebook.service.factory.ServiceFactory;

import java.util.List;

/**
 * Implementation of any methods from {@link UserService}
 */
public class UserController {

    public static void main(String[] args) {

        UserService allUsersMethods = ServiceFactory.getAllUsersMethods();
//        for (User elem : allUsersMethods.getAllUsers()) {
//            System.out.println(elem);
//            System.out.println();
//        }
//
//        String name = "Aleksandr";
//        List<User> listByName = allUsersMethods.getByName(name);
//        for (User elem : listByName) {
//            System.out.println(elem);
//        }
//
//        String surname = "Iushko";
//        List<User> listBySurname = allUsersMethods.getBySurname(surname);
//        for (User elem : listBySurname) {
//            System.out.println(elem);
//        }
//
//        int age = 27;
//        List<User> listByAge = allUsersMethods.getByAge(age);
//        for (User elem : listByAge) {
//            System.out.println(elem);
//        }
//
//        String status = "ACTIVE_SEARCH";
//        List<User> listByMaritalStatus = allUsersMethods.getByMaritalStatus(status);
//        for (User elem : listByMaritalStatus) {
//            System.out.println(elem);
//            System.out.println();
//        }

        User user = new User();
        user.setName("Alex");

        allUsersMethods.delete(1L);
        allUsersMethods.create(user);
        allUsersMethods.update(user);

    }
}
