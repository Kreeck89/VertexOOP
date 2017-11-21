package lesson7OOP.annotation.Work2;

public class Service {

    public static void main(String[] args) throws NoSuchMethodException {

        SomeClass someClass = new SomeClass();
        someClass.newPrint();

        FunctionalTest test = new FrunctionalPrintImpl();
        test.printed();

        FunctionalTest test2 = () -> System.out.println("New text");
        test2.printed();
    }

}
