package lesson2OOP.HomeWork.homeWorkFromLists;

/**
 * My method Equals.
 */
public class HomeTask6 {

    public static void main(String[] args) {
        String string1 = "Privet";
        String string2 = "Privet";

        System.out.println(myEquals(string1, string2));
    }

    private static boolean myEquals(String st1, String st2) {
        int value = 0;
        if (st1.length() == st2.length()) {
            for (int i = 0; i < st1.length(); i++) {
                if (st1.charAt(i) == st2.charAt(i)) {
                    value++;
                }
            }
        }
        return value == st1.length();
    }
}
