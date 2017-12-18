package homeTaskFromLists.pack10.jsonUse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import homeTaskFromLists.pack10.Man;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class MainGSON {

    public static void main(String[] args) {
        Man man = new Man();
        man.setAge(20);
        man.setCity("Kiev");
        man.setName("Oleg");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        File file = new File("src/main/java/homeTaskFromLists/pack10/jsonUse/json-test.json");

        String joinUser = gson.toJson(man);
        System.out.println(joinUser);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(joinUser);
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String json = new String(Files.readAllBytes(file.toPath()));
            System.out.println(json);

            Man man2 = gson.fromJson(json, Man.class);
            System.out.println(man2);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(gson.toJson(man));
    }
}
