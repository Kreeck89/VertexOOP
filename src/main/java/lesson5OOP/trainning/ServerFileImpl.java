package lesson5OOP.trainning;

import java.io.*;

public class ServerFileImpl implements FileService {

    private static String PATH = "src/main/java/lesson5OOP/trainning/textInterface";

    @Override
    public void writeText(String string) {
        File file = new File(PATH);
        try (FileWriter writer = new FileWriter(file,true)) {
            writer.write(string);
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readText() {
        StringBuilder builder = new StringBuilder();
        File file = new File(PATH);
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

    @Override
    public void writeBuffer(String string) {
        try (BufferedWriter writer1 = new BufferedWriter(new FileWriter(PATH, true))) {
            writer1.write(string);
            writer1.newLine();
            writer1.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readerBuffer() {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            String date;
            while ((date = reader.readLine()) != null) {
                builder.append(date)
                        .append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
