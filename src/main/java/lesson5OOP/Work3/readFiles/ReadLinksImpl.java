package lesson5OOP.Work3.readFiles;

import java.io.*;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class ReadLinksImpl implements ReadLinks {

    @Override
    public List<String> getString(String link) {
        List<String> list = new LinkedList<>();
        try (BufferedReader readerBuff = new BufferedReader(new FileReader(link))) {
            String dataLink;
            while ((dataLink = readerBuff.readLine()) != null) {
                try (InputStream inputStream = new URL(dataLink).openStream()) {
                    InputStreamReader reader = new InputStreamReader(inputStream);
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    String data;
                    while ((data = bufferedReader.readLine()) != null) {
                        list.add(data);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
