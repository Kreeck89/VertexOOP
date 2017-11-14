package lesson5OOP.Work3;

import lesson5OOP.Work3.readFiles.ReadLinks;
import lesson5OOP.Work3.readFiles.ReadLinksImpl;
import lesson5OOP.Work3.saveFiles.SaveFileImpl;
import lesson5OOP.Work3.saveFiles.SaveFiles;

public class Service {

    public static void main(String[] args) {
        String listsLinks = "src/main/java/lesson5OOP/Work3/files/fileLinks.txt";
        String loadFiles = "src/main/java/lesson5OOP/Work3/files/saveFiles.txt";

        ReadLinks readLinks = new ReadLinksImpl();
        SaveFiles saveFiles = new SaveFileImpl();

        saveFiles.saveStrings(loadFiles, readLinks.getString(listsLinks));

    }
}
