package lesson2OOP.mapUser;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<User> users = new LinkedList<>();
        User user1 = new User();
        User user2 = new User();
        user1.setName("Alex");
        user2.setName("Bob");
        users.add(user1);
        users.add(user2);

        for (User user : users) {
            System.out.println(user.getName());
        }

        List<Post> posts = new LinkedList<>();
        Post post = new Post();
        post.setTitle("Java 9");
        post.setDescription("I steel use Java 8.0");

        posts.add(post);

        for (Post elem : posts) {
            System.out.println(elem.getTitle());
            System.out.println(elem.getDescription());
        }

        System.out.println(posts.contains(post));


        Map<User, Post> alexPosts = new HashMap<>();
        alexPosts.put(user1, post);

        System.out.println();
        System.out.println();
        for (Map.Entry<User, Post> userPostEntry : alexPosts.entrySet()) {
            System.out.println(userPostEntry.getKey().getName());
            System.out.println(userPostEntry.getValue().getTitle());
            System.out.println(userPostEntry.getValue().getDescription());
        }
    }
}
