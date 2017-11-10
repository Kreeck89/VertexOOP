package lesson4OOP.facebook.data;

import lesson4OOP.facebook.model.Friends;
import lesson4OOP.facebook.model.Post;
import lesson4OOP.facebook.model.User;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;

public class Database {

    public static List<User> getAllUsers() {
        List<User> list = new LinkedList<>();
        User user = new User();
        user.setName("Aleksandr");
        list.add(user);
        return list;
    }

    public static List<Post> getAllPost() {
        List<Post> list = new LinkedList<>();
        Post post = new Post();
        post.setTitle("Some Title");
        post.setDiscription("Some text for print");
        list.add(post);
        return list;
    }

    public static List<Friends> getAllFriends() {
        List<Friends> list = new LinkedList<>();
        Friends friends = new Friends();
        friends.setName("Valera");
        friends.setCity("Kiev");
        friends.setAge(27);
        LocalDate born = LocalDate.of(1990, Month.OCTOBER, 11);
        LocalDate now = LocalDate.now();
        friends.setDateOfBorn(born);
        friends.setAgeInDays(ChronoUnit.DAYS.between(born, now));

        list.add(friends);
        return list;
    }
}
