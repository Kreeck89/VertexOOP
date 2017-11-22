package facebook.data;

import facebook.model.Friend;
import facebook.model.Group;
import facebook.model.Post;
import facebook.model.User;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Database {

    public static List<User> getAllUsers() {
        LinkedList<User> listUsers = new LinkedList<>();
        User user1 = new User("Aleksandr",
                "Iushko",
                "Siktivkar",
                28,
                User.MaritalSatusUser.ACTIVE_SEARCH.toString());

        User user2 = new User();
        User user3 = new User();
        user2.setName("Igor");
        user2.setCityBorn("Kiev");
        user3.setName("Valera");
        user3.setSurname("Zinchenko");
        user3.setCityBorn("Kiev");
        user3.setAge(27);
        user3.setMaritalStatus(User.MaritalSatusUser.ACTIVE_SEARCH.toString());
        listUsers.add(user1);
        listUsers.add(user2);
        listUsers.add(user3);
        return listUsers;
    }

    public static List<Post> getAllPosts() {
        LinkedList<Post> listPosts = new LinkedList<>();
        Post post1 = new Post("Title Example 1", "Description text in first example", new  Date());
        Post post2 = new Post();
        post2.setTitle("TITLE 2");
        post2.setDescription("DESCRIPTION for second Example");
        post2.setDataPost(new Date());
        listPosts.add(post1);
        listPosts.add(post2);
        return listPosts;
    }

    public static List<Group> getAllGroups() {
        LinkedList<Group> listGroups = new LinkedList<>();
        Group group1 = new Group("Vertex group", 10000L, LocalDate.now());
        Group group2 = new Group();
        group2.setNameGroup("SOG - Some Other Group");
        group2.setFollowers(1000L);
        group2.setDataOfCreate(LocalDate.of(2005, 01, 01));
        listGroups.add(group1);
        listGroups.add(group2);
        return listGroups;
    }

    public static List<Friend> getAllFriends() {
        LocalDate now = LocalDate.now();
        LocalDate valersBithday = LocalDate.of(1990, 03, 12);
        LocalDate alexBirthday = LocalDate.of(1990, 05, 22);
        long valerasDay = ChronoUnit.DAYS.between(valersBithday, now);
        long alexDays = ChronoUnit.DAYS.between(alexBirthday, now);

        LinkedList<Friend> listFriends = new LinkedList<>();
        Friend friend1 = new Friend("Valera",
                "Kiev",
                27,
                valersBithday,
                valerasDay);
        Friend friend2 = new Friend("Alex",
                "Mirgorod",
                27,
                alexBirthday,
                alexDays);
        Friend friend3 = new Friend();
        friend3.setNameFriend("Igor");
        Friend friend4 = new Friend();
        friend4.setNameFriend("Artem");
        friend4.setCityLive("Cherkassy");
        friend4.setAge(29);
        friend4.setDateOfBorn(LocalDate.of(1988, 05, 03));
        listFriends.add(friend1);
        listFriends.add(friend2);
        listFriends.add(friend3);
        listFriends.add(friend4);
        return listFriends;
    }
}
