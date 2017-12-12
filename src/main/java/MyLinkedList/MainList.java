package MyLinkedList;

import java.util.Arrays;

public class MainList {

    public static void main(String[] args) {

        MyLinkedList<String> stringMyLinkedList = new MyLinkedList<String>();

        stringMyLinkedList.addFirst("first");
        stringMyLinkedList.addFirst("second");
        stringMyLinkedList.addFirst("therd");
        System.out.println(stringMyLinkedList.size());
        System.out.println(stringMyLinkedList.getByIndex(0));


    }
}

