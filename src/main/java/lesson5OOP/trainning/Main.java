package lesson5OOP.trainning;

public class Main {

    public static void main(String[] args) {

        FileService service = new ServerFileImpl();

        String s = "Some text";
        String s2 = "second TEXT";
        service.writeText(s);

        System.out.print(service.readText());

        service.writeBuffer(s2);

        System.out.println(service.readerBuffer());
    }
}
