package lesson2OOP;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Work7 {

    public static void main(String[] args) {
        Integer[] mass = {10, 12, 23, 2312};
        String[] arr = {"adsas", "as", "22312"};

        final List<Integer> list = new LinkedList<>();
        final List<String> list1 = new LinkedList<>();

        Collections.addAll(list, mass);
        Collections.addAll(list1, arr);
        System.out.println(list);
        System.out.println(list1);
    }
}
