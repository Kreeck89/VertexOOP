package lesson2OOP.HomeWork.customer;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUsers {

    public static List<User> getAllUsers() {
        List<User> usersList = new ArrayList<>();
        usersList.add(new User("Olga", "Oleg@gmail.con", "qwerty12", 938012312));
        usersList.add(new User("Vasiliy", "Brovkin", "Brov", "Kiev", "Bro@mail.ru",
                "12345", 29, 965487799));
        usersList.add(new User());

        return usersList;
    }


}
