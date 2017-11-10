package lesson3OOP.work9.exeptions;

public class SiteNFE extends RuntimeException {

    @Override
    public void printStackTrace() {
        System.out.println("This site not found in good List.");
    }
}
