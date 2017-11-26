package homeTaskFromLists.pack1;

/**
 * Tasks form lists, page 10 (task 7).
 *
 * My method indexOf without javas indexOf.
 */
public class Task5 {

    public static void main(String[] args) {
        String text = "Some text for testing indexOf working";
        String searchingText = "indexOf";
        System.out.println("My indexOf value is: " + myIndexOf(text, searchingText));
        System.out.println("Javas indexOf value is: " + myIndexOf(text, searchingText));
    }

    private static int myIndexOf(String text, String searchingText) {
        for (int i = 0; i < text.length() - searchingText.length(); i++) {
            if (text.substring(i, i + searchingText.length()).equals(searchingText)) {
                return i;
            }
        }
        return 0;
    }
}
