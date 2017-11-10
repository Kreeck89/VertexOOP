package lesson2OOP;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Work1 {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i+10);
        }
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 != 0) {
                iter.remove();
            }
        }
        System.out.println(list);
    }
}
