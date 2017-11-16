package lesson4OOP.facebook.controller;

import lesson4OOP.facebook.model.Post;
import lesson4OOP.facebook.services.PostService;
import lesson4OOP.facebook.services.factory.ServiceFactory;
import lesson4OOP.facebook.services.impl.PostServiceImpl;

import java.util.List;

public class PostController {

    public static void main(String[] args) {

        PostService allPosts = ServiceFactory.getAllPosts();
        for (Post elem : allPosts.getAllPost()) {
            System.out.println(elem);
        }
    }
}
