package lesson2OOP.HomeWork.homeWorkFromLists;

import java.util.Arrays;

/**
 * Split by symbol " ".
 */
public class HomeTask9 {

    public static void main(String[] args) {
        String s1 = "Some text for example   ";
        String s2 = "   Second sentences     ";
        System.out.println(Arrays.toString(mySplit(s1, s2)));
    }

    private static String[] mySplit(String string1, String string2) {
        string1 = string1.trim() + " " + string2.trim() + " ";
        char n = ' ';
        int numMass = 0;

        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == n) {
                numMass++;
            }
        }
        String [] array = new String[numMass];
        for (int j = 0; j < array.length; ) {
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) == n) {
                    array[j] = string1.substring(0, i);
                    string1 = string1.substring(i + 1, string1.length());
                    i = 0;
                    j++;
                }
            }
            return array;
        }
        return null;
    }
}
