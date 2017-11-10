package lesson2OOP;

import java.util.LinkedList;
import java.util.List;

public class Work2 {

    public static void main(String[] args) {

        List <Integer> list = new LinkedList<>();
        int length = 100;
        for (int i = 0; i < length; i++) {
            list.add(i);
            if (list.size() % 10 == 0) {
                System.out.println("It element 10");
            }
        }
    }
}
