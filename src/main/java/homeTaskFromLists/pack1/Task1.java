package homeTaskFromLists.pack1;

import java.util.LinkedList;
import java.util.List;

/**
 * Task from list, page 9 (task 3).
 *
 * Count how many words in sentence and print it.
 */
public class Task1 {

    public static void main(String[] args) {
        String text = "    Hi, Oleg!    How are  you?   ";
        List<String> wordsList = countWords(text);
        int counter = 0;

        for (String elem : wordsList) {
            System.out.println(elem);
            counter++;
        }
        System.out.println("Value words in sentence: " + counter);
    }

    private static List<String> countWords(String text) {
        LinkedList<String> list = new LinkedList<>();
        text = text.trim();
        char found = ' ';
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == found) {
                list.add(text.substring(0, i));
                text = text.substring(i, text.length()).trim();
                i = 0;
            }
        }
        return list;
    }
}
