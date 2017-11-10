package lesson3OOP.work9.exeptions;

public class BadCreditalsE extends RuntimeException {

    @Override
    public void printStackTrace() {
        System.out.println("It`s bad site for use!!!");
    }
}
