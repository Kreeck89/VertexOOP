package lesson2OOP.HomeWork.homeWorkFromLists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Reverse some text in 3 different methods.
 */
public class HomeTask5 {

    public static void main(String[] args) {
        String string = "abcd1234";
        System.out.println(returnwithString(string));
        System.out.println(returnWithArray(string));
        System.out.println(returnWithCollections(string));

    }

    private static String returnwithString(String string) {
        String revers = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            revers += string.charAt(i);
        }
        return revers;
    }

    private static String returnWithArray(String string) {
        String revers = "";
        char[] stringOfChar = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            stringOfChar[i] = string.charAt((string.length() - 1) - i);
        }
        for (int i = 0; i < stringOfChar.length; i++) {
            revers += stringOfChar[i];
        }
        return revers;
    }

    private static String returnWithCollections(String string) {
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
        }
//        Collections.sort(list);
        Collections.reverse(list);
        return String.valueOf(list);
    }
}
