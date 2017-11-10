package lesson2OOP;

import java.util.LinkedList;
import java.util.List;

public class Work5 {

    public static void main(String[] args) {

        List listAll = new LinkedList<>();
        List<Integer> listInt = new LinkedList<>();
        List<String > listString = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                listAll.add(i);
            } else {
                listAll.add("Text" + i);
            }
        }
        System.out.println(listAll);

        for (Object element : listAll) {
            if (element instanceof Integer) {
                listInt.add((Integer) element);
            } else if (element instanceof String) {
                listString.add((String) element);
            }
        }
        System.out.println(listInt);
        System.out.println(listString);
        }
}

