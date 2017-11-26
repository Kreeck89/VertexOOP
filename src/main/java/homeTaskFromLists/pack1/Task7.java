package homeTaskFromLists.pack1;

import java.util.Arrays;

/**
 * Tasks from lists, page 10 (Task 9).
 *
 * My method split without javas split.
 * Return array with words after mySplit from two text;
 * Checked before trim.
 */
public class Task7 {

    public static void main(String[] args) {
        String text1 = "Some text for example   ";
        String text2 = "   Second sentences     ";
        System.out.println(Arrays.toString(mySplit(text1, text2)));
    }

    private static String [] mySplit(String text1, String text2) {
        text1 = text1.trim() + " " + text2.trim() + " ";
        char n = ' ';
        int massValue = 0;
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) == n) {
                massValue++;
            }
        }
        String[] splitArray = new String[massValue];
        for (int i = 0; i < splitArray.length; ) {
            for (int j = 0; j < text1.length(); j++) {
                if (text1.charAt(j) == n) {
                    splitArray[i] = text1.substring(0, j);
                    text1 = text1.substring(j + 1, text1.length());
                    j = 0;
                    i++;
                }
            }
            return splitArray;
        }
        return null;
    }
}
