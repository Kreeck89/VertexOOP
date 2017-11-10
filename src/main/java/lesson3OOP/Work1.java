package lesson3OOP;

public class Work1 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
                arr[6] = 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index is not found.");
        } finally {
            System.out.println("Error");
        }
    }
}
