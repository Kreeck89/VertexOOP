package lesson2OOP.HomeWork.homeWorkFromLists;

import java.util.ArrayList;
import java.util.List;

/**
 * Count words in sentences.
 */
public class HomeTask3 {

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        String s = "    Hi, Oleg!    How are  you?   ";
        s = s.trim();

        System.out.println(s.trim());

        wordList = byWord(s);
        for (String elem : wordList) {
            System.out.println(elem);
        }
    }

    private static List<String> byWord(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                list.add(s.substring(0, i));
                s = s.substring(i, s.length()).trim();
                i = 0;
            }
        }
        return list;
    }
}
