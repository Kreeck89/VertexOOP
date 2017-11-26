package homeTaskFromLists.pack1;

/**
 * Task from lists, page 10 (task 6).
 *
 * My method "Equals" without javas equals.
 */
public class Task4 {

    public static void main(String[] args) {
        String st1 = "Text;";
        String st2 = "Text;";
        System.out.println("Result method myEquals is: " + myEquals(st1, st2));
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
