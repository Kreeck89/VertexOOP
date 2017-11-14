package lesson5OOP.Work2;

import java.io.FileReader;
import java.io.IOException;

public class MyReaderImpl implements MyReader {

    @Override
    public String someRead() {
        String s = "src/main/java/lesson5OOP/Work1/files/file3.txt";
        String text = "";
        int buff;
        try (FileReader reader = new FileReader(s)) {
            StringBuilder builder = new StringBuilder();
            while ((buff = reader.read()) != -1) {
                builder.append((char) buff);
                text = builder.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
