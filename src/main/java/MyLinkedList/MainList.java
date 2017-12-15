package MyLinkedList;

import java.util.Arrays;

public class MainList {

    public static void main(String[] args) {

        MyLinkedList<String> stringMyLinkedList = new MyLinkedList<String>();
        System.out.println(stringMyLinkedList.size());

        stringMyLinkedList.addFirst("first");
        stringMyLinkedList.addFirst("second");
        stringMyLinkedList.addFirst("therd");
        System.out.println(stringMyLinkedList.size());
//        System.out.println(stringMyLinkedList.getByIndex(0));
//
//        for (String s : stringMyLinkedList) {
//            System.out.println(s);
//        }

//        stringMyLinkedList.remove(1);
//
//        for (String s : stringMyLinkedList) {
//            System.out.println(s);
//        }
//        System.out.println(stringMyLinkedList.size());
//
//        stringMyLinkedList.clear();
//        System.out.println("Print after clear:");
//        for (String s : stringMyLinkedList) {
//            System.out.println("Element of list is: " + s);
//        }
//        System.out.println(stringMyLinkedList.size());

        stringMyLinkedList.set(0, "Insert String");
        for (String s : stringMyLinkedList) {
            System.out.println(s);
        }
    }
}

