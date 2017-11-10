package lesson2OOP;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Work6 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> seter = new HashSet<>();

        list.add(1);
        list.add(11);
        list.add(89);
        list.add(1);
        list.add(9);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(43);

        for (Integer element : list) {
            set.add(element);
        }

        seter.addAll(list);

        System.out.println(list);
        System.out.println(set);
        System.out.println(seter);
    }
}
