package homeTaskFromLists.pack9;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.*;

/**
 * Tasks from lists, page 65 (Task1).
 * <p>
 * My easy personal notes.
 */
public class NotePad {

    public static void main(String[] args) {
        List<MyMessages> messagesList = new ArrayList<>();
        MyMessageSet(messagesList);
        for (MyMessages elem : messagesList) {
            System.out.println("Your notes on date: " + elem.getDate().toZonedDateTime());
            for (String s : elem.getNotes()) {
                System.out.println("note: " + s);
            }
        }
        SaveToFileMyNotes(messagesList);
        String myPath = "src/main/java/homeTaskFromLists/homeTaskFromLists.pack9/file.txt";
        ReadFromFileNotes(myPath);
    }

    /**
     * Method for save some notes;
     * Enter date for write notes,
     * And write some notes.
     */
    private static void MyMessageSet(List<MyMessages> messagesList) {
        MyMessages myMess = new MyMessages();
        String note = "1";
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter date for notes:");
        System.out.println("Year: ");
        int y = scanner.nextInt();
        System.out.println("Month: ");
        int m = scanner.nextInt();
        System.out.println("Day: ");
        int d = scanner.nextInt();
        GregorianCalendar date = new GregorianCalendar(y, m, d);
        myMess.setDate(date);

        System.out.println("Enter your notes: " +
                "\n" +
                "q - for Exit;" +
                "\n" +
                "Enter - for next notes.");
        while (!note.equals("q")) {
            note = scanner2.nextLine();
            if (!note.equals("q")) {
                myMess.getNotes().add(note);
            }
        }
        messagesList.add(myMess);
    }

    /**
     * Method for save your notes to some file, if you need it.
     */
    private static void SaveToFileMyNotes(List<MyMessages> messagesList) {
        String pathName = "src/main/java/homeTaskFromLists/homeTaskFromLists.pack9/file.txt";
        File file = new File(pathName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (MyMessages elem : messagesList) {
                writer.write(String.valueOf(elem.getDate().toZonedDateTime()));
                writer.newLine();
                for (String s : elem.getNotes()) {
                    writer.write(s);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Read and write your file with notes and print it.
     */
    private static void ReadFromFileNotes(String pathName) {
        File file = new File(pathName);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String node;
            while ((node = reader.readLine()) != null) {
                System.out.print(node + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

@Data
@Getter
@Setter
class MyMessages {
    private GregorianCalendar date;
    private ArrayList<String> notes = new ArrayList<>();

}