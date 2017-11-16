package lesson4OOP.facebook.controller;

import lesson4OOP.facebook.model.User;
import lesson4OOP.facebook.services.UserService;
import lesson4OOP.facebook.services.factory.ServiceFactory;
import lesson4OOP.facebook.services.impl.UserServiceImpl;

import java.util.List;

public class UserController {

    public static void main(String[] args) {

        UserService allUsers = ServiceFactory.getAllUsers();
        for (User elem : allUsers.getAllUser()) {
            System.out.println();
            System.out.println(elem.getName());
        }

        String name = null;
        System.out.println(allUsers.getByName(name));
    }
}
