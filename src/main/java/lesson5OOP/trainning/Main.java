package lesson5OOP.trainning;

public class Main {

    public static void main(String[] args) {

        FileService service = new ServerFileImpl();

        String s = "Some text";
        service.writeText(s);

        System.out.println(service.readText());
    }
}
