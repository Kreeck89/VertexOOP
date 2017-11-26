package homeTaskFromLists.pack1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Task from Lists, page 9 (task 5).
 *
 * returnWithString(String):String - Method revers and return String;
 * returnWithArray(String):char[] - Method revers and return Array;
 * returnWithCollection(String):List - Method revers with Collections and return List<Character>.
 */
public class Task3 {

    public static void main(String[] args) {
        String example = "abcd1234";
        System.out.println(returnWithString(example));
        System.out.println(returnWithArray(example));
        System.out.println(returnWithCollection(example));
    }

    private static String returnWithString(String string) {
        String revers = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            revers += string.charAt(i);
        }
        return revers;
    }

    private static char [] returnWithArray(String string) {
        char[] reversChars = new char[string.length()];
        for (int i = 0; i < reversChars.length; i++) {
            reversChars[i] = string.charAt((string.length() - 1) - i);
        }
        return reversChars;
    }

    private static List<Character> returnWithCollection(String string) {
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
        }
        Collections.reverse(list);
        return list;
    }
}
