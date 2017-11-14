package lesson5OOP.Work3.saveFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveFileImpl implements SaveFiles {

    @Override
    public void saveStrings(String link, List<String> list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(link, true))) {
            for (String elem : list) {
                writer.write(elem);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
