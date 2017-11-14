package lesson5OOP.Work1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteYourTextImpl implements WriteYourText {

    @Override
    public void writeToFile1(String s) {
        String path = "src/main/java/lesson5OOP/Work1/files/file1.txt";
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(s);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeToFile2(String s) {
        String path = "src/main/java/lesson5OOP/Work1/files/file2.txt";
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(s);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeToFile3(String s) {
        String path = "src/main/java/lesson5OOP/Work1/files/file3.txt";
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(s);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeToFile4(String s) {
        String path = "src/main/java/lesson5OOP/Work1/files/file4.txt";
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(s);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
