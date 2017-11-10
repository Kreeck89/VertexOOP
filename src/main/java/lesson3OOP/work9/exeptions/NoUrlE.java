package lesson3OOP.work9.exeptions;

public class NoUrlE extends RuntimeException {

    @Override
    public void printStackTrace() {
        System.out.println("Don`t found in good list.");
    }
}
