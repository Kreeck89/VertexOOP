package homeTaskFromLists.pack4;

/**
 * Tasks from lists, page 31 (Task 4).
 *
 * Testing static plus() in main class and nonStatic pluss() in Entity class.
 */
public class MainInteger {

    public static void main(String[] args) {

        MyInteger integer1 = new MyInteger();
        MyInteger integer2 = new MyInteger();
        integer1.setValue(100);
        integer2.setValue(10);
        System.out.println(plus(integer1.getValue(), integer2.getValue()));

        System.out.println(integer1.pluss(new MyInteger(25)));
    }

    private static int plus(int num1, int num2) {
        int value = num1 + num2;
        return value;
    }
}
