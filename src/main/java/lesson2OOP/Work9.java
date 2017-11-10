package lesson2OOP;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Work9 {

    public static void main(String[] args) {
        Map map = new HashMap();
        List<Integer> list = new LinkedList<>();
        List<String> list1 = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            map.put(i + 1, "Map" + i);
        }
        for (int i = 0; i < 10; i++) {
            map.put("Map" + i, i + 10);
        }

        for (Object elem : map.keySet()) {
            if (elem instanceof Integer) {
                list.add((Integer) elem);
            } else if (elem instanceof String) {
                list1.add((String) elem);
            }
            }
        for (Object elem : map.values()) {
            if (elem instanceof String) {
                list1.add((String) elem);
            } else if (elem instanceof Integer) {
                list.add((Integer) elem);
            }
        }
        System.out.println(map);
        System.out.println(list);
        System.out.println(list1);
    }
}
