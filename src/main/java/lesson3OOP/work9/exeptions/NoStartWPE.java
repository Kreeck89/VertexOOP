package lesson3OOP.work9.exeptions;

public class NoStartWPE extends RuntimeException {

    @Override
    public void printStackTrace() {
        System.err.println("Don`t security site!!!");
    }
}
