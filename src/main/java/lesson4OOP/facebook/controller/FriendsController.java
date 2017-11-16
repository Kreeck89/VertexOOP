package lesson4OOP.facebook.controller;

import lesson4OOP.facebook.model.Friends;
import lesson4OOP.facebook.services.FriendsService;
import lesson4OOP.facebook.services.factory.ServiceFactory;
import lesson4OOP.facebook.services.impl.FriendsServiceImpl;

import java.util.List;

public class FriendsController {

    public static void main(String[] args) {

        FriendsService allFriends = ServiceFactory.getAllFriends();
        for (Friends elem : allFriends.getAllFriends()) {
            System.out.println(elem);
        }
    }
}
