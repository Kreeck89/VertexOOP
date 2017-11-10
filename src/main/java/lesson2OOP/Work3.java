package lesson2OOP;

import java.util.LinkedList;
import java.util.List;

public class Work3 {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i + 1);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
        if (i % 2 == 0) {
                list.set(i, 10);
            } else {
            list.set(i, 20);
        }
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }

}
