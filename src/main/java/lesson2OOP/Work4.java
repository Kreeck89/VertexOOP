package lesson2OOP;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Work4 {

    public static void main(String[] args) {

        List<Integer> level = new LinkedList<>();
        level.add(1);
        level.add(2 );
        level.add(3);
        level.add(4);
        System.out.println(level);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        System.out.println(set);
    }
}
