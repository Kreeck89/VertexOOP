package lesson4OOP.facebook.controller;

import lesson4OOP.facebook.model.Post;
import lesson4OOP.facebook.services.PostService;
import lesson4OOP.facebook.services.factory.ServiceFactory;

import java.util.Date;
import java.util.List;

public class PostController {

    public static void main(String[] args) {

        PostService allPosts = ServiceFactory.getAllPostsMethods();
        for (Post elem : allPosts.getAllPost()) {
            System.out.println(elem);
        }

        String text = "Some";
        System.out.println("Test by Title:");
        List<Post> byTitle = allPosts.getByTitle(text);
        for (Post elem : byTitle) {
            System.out.println(elem);
        }

        Date date = new Date();
        System.out.println("Test by Date:");
        List<Post> byDate = allPosts.getByDate(date);
        for (Post elem : byDate) {
            System.out.println(elem);
        }
    }
}
