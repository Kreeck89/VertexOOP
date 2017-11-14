package lesson5OOP.trainning;

import java.io.*;

public class ServerFileImpl implements FileService {

    @Override
    public void writeText(String string) {
        String path = "src/main/java/lesson5OOP/trainning/textInterface";
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file,true)) {
            writer.write(string);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readText() {
        StringBuilder builder = new StringBuilder();
        String path = "src/main/java/lesson5OOP/trainning/textInterface";
        File file = new File(path);
        int buff;
        try (FileReader reader = new FileReader(file)) {
            while ((buff = reader.read()) != -1) {
                builder.append((char) buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
