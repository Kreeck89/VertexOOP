package lesson2OOP.HomeWork.homeWorkFromLists;

/**
 * Return indexOf (without this commands). Created my method.
 */
public class HomeTask7 {

    public static void main(String[] args) {
        String text = "Some text. We search here some1 words.";
        String searchingText = "some1";
        System.out.println(myIndexOf(text, searchingText));
        System.out.println(text.indexOf(searchingText));
    }

    private static int myIndexOf(String st1, String st2) {
        for (int i = 0; i < st1.length() - st2.length(); i++) {
            if (st1.substring(i, i + st2.length()).equals(st2)) {
                return i;
                }
            }
        return 0;
        }
    }
