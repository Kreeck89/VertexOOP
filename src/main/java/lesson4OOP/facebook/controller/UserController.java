package lesson4OOP.facebook.controller;

import lesson4OOP.facebook.model.User;
import lesson4OOP.facebook.services.UserService;
import lesson4OOP.facebook.services.impl.UserServiceImpl;

import java.util.List;

public class UserController {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        List<User> all = userService.getAllUser();
        for (User elem : all) {
            System.out.println();
            System.out.println(elem.getName());
        }
    }
}
