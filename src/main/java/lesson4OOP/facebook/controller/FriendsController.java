package lesson4OOP.facebook.controller;

import lesson4OOP.facebook.model.Friends;
import lesson4OOP.facebook.services.FriendsService;
import lesson4OOP.facebook.services.impl.FriendsServiceImpl;

import java.util.List;

public class FriendsController {

    public static void main(String[] args) {

        FriendsService service = new FriendsServiceImpl();
        List<Friends> friendsList = service.getAllFriends();
        for (Friends elem : friendsList) {
            System.out.println(elem);
        }
    }
}
