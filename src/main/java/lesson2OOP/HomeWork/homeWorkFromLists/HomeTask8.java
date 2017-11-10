package lesson2OOP.HomeWork.homeWorkFromLists;

/**
 * My method "endsWith" for return boolean of end some text.
 */
public class HomeTask8 {

    public static void main(String[] args) {

        String s = "Some text for test. 1";
        String search = "1";
        System.out.println(myEndsWith(s, search));
    }

    private static boolean myEndsWith(String string, String foundString) {
        String[] chars = string.split(" ");
        if (chars[chars.length - 1].equals(foundString)) {
            return true;
        }
        return false;
    }
}
