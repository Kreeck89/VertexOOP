package lesson2OOP;

import java.util.HashMap;
import java.util.Map;

public class Work8 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(1, "Hello");
        map.put(3, "Hello");
        map.put(1, "Hello");
        map.put(2, "Hello");

        System.out.println(map);
    }
}
