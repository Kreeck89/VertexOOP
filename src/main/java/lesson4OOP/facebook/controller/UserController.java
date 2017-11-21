package lesson4OOP.facebook.controller;

import lesson4OOP.facebook.model.User;
import lesson4OOP.facebook.services.UserService;
import lesson4OOP.facebook.services.factory.ServiceFactory;

import java.util.List;

public class UserController {

    public static void main(String[] args) {

        UserService allUsers = ServiceFactory.getAllUsersMethods();
        for (User elem : allUsers.getAllUser()) {
            System.out.println();
            System.out.println(elem);
        }

        String name = "Aleksandr";
        List<User> byName = allUsers.getByName(name);
        for (User elem : byName) {
            System.out.println(elem);
        }

        String surname = "Yarov";
        List<User> bySurname = allUsers.getBySurname(surname);
        for (User elem : bySurname) {
            System.out.println(elem);
        }

        int age = 30;
        List<User> byAge = allUsers.getByAge(age);
        for (User elem : byAge) {
            System.out.println(elem);
        }
    }
}
