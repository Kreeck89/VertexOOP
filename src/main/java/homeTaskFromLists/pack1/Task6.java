package homeTaskFromLists.pack1;

/**
 * Tasks from lists, page 10 (Task 8).
 *
 * My methods endsWith, without javas endsWith.
 */
public class Task6 {

    public static void main(String[] args) {
        String text = " Some text for check methods. 1  ";
        String search = "1";
        System.out.println("Is this text ends to \"search\" value? - " + myEndsWith(text, search));
    }

    private static boolean myEndsWith(String text, String search) {
        text = text.trim();
        String[] charWords = text.split(" ");
        return charWords[charWords.length - 1].equals(search);
    }
}
