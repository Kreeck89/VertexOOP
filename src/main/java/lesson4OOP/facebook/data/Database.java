package lesson4OOP.facebook.data;

import lesson4OOP.facebook.model.Friends;
import lesson4OOP.facebook.model.Post;
import lesson4OOP.facebook.model.User;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Database {

    public static List<User> getAllUsers() {
        List<User> list = new LinkedList<>();
        User user1 = new User();
        User user2 = new User();
        user1.setName("Aleksandr");
        user1.setSurname("Bobkovich");
        user1.setAge(30);
        user2.setName("Aleksandr");
        user2.setSurname("Yarov");
        user2.setAge(24);
        list.add(user1);
        list.add(user2);
        return list;
    }

    public static List<Post> getAllPost() {
        List<Post> list = new LinkedList<>();
        Post post = new Post();
        post.setTitle("Some Title");
        post.setDiscription("Some text for print");
        post.setDatePost(new Date());
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
