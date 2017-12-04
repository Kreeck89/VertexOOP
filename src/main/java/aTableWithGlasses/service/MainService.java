package aTableWithGlasses.service;

import aTableWithGlasses.model.AbstractGlass;
import aTableWithGlasses.model.AbstractHuman;
import aTableWithGlasses.model.AbstractTable;
import aTableWithGlasses.model.implModel.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Tasks from lists, page 53 (Task with Interfaces, Abstract and Classes);
 * Task with Humans, Glasses and Tables;
 * Other JavaDocs in Interfaces and MainService classes.
 */
public class MainService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AbstractHuman[] arrayOfHumans = createArray(4);
        List<AbstractTable> listOfTable = listOfTable(10);
        List<AbstractGlass> someGlasses = getSomeGlasses(arrayOfHumans);
        takeAGlasses(someGlasses, arrayOfHumans);

//        for (int i = 0; i < arrayOfHumans.length; i++) {
//            System.out.println("HUMAN:");
//            arrayOfHumans[i].printAboutMe();
//        }
//
//        for (int i = 0; i < arrayOfHumans.length; i++) {
//            try {
//                System.out.println("HUMAN GLASS: " + "\n" + arrayOfHumans[i].getWithGlass().getFormType());
//            } catch (NullPointerException e) {
//                System.out.println("You don`t have a glass");
//            }
//        }
//
//        for (int i = 0; i < arrayOfHumans.length; i++) {
//            System.out.println("GLASS:" + "\n" + someGlasses.get(i));
//        }


        for (int i = 0; i < listOfTable.size(); i++) {
            System.out.println("Table num " + i + " is: " + listOfTable.get(i).isDry());
        }
        pourOnTableWithChoose(arrayOfHumans, listOfTable);

        for (int i = 0; i < listOfTable.size(); i++) {
            System.out.println("Table num " + i + " is: " + listOfTable.get(i).isDry());
        }

        scanner.close();
    }

    /**
     * @return instance of {@link AbstractHuman list}
     * Create List with random HumanMan and HumanWoman;
     * value of exemplars is passed with method call.
     */
    private static AbstractHuman[] createArray(int exemplars) {
        AbstractHuman[] humansArray = new AbstractHuman[4];
        Random random = new Random();
        for (int i = 0; i < exemplars; i++) {
            int val = 1 + random.nextInt(10);
            if (val == 1) {
                humansArray[i] = new HumanMan();
            } else {
                humansArray[i] = new HumaWoman();
            }
            humansArray[i].setName("Oleg" + i);
            humansArray[i].setAge(18 + i);
        }
        return humansArray;
    }

    /**
     * @return instance of {@link AbstractTable list}
     * Create List with tables;
     * value of exemplars is passed with method call.
     */
    private static List<AbstractTable> listOfTable(int value) {
        ArrayList<AbstractTable> listOfTables = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            listOfTables.add(new Table());
        }
        return listOfTables;
    }

    /**
     * @return instance of {@link AbstractHuman list}
     * Create List with glasses;
     * value exemplars is equal List with Humans.length;
     * glasses added random - circle or square;
     */
    private static List<AbstractGlass> getSomeGlasses(AbstractHuman[] arraysOfHuman) {
        List<AbstractGlass> listOfGlasses = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < arraysOfHuman.length; i++) {
            int val = 1 + random.nextInt(3);
            if (val == 1) {
                listOfGlasses.add(new GlassCircle());
            } else {
                listOfGlasses.add(new GlassSquare());
            }
        }
        return listOfGlasses;
    }

    /**
     * All Humans can take a glass or not, it`s choose randomly;
     * All the glasses that took some Human will fill;
     * the glasses in hand is not Empty!
     */
    private static void takeAGlasses(List<AbstractGlass> list, AbstractHuman[] humans) {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int val = 1 + random.nextInt(2);
            if (val == 1) {
                humans[i].takeGlass(list.get(i));
            }
            humans[i].fillGlass();
        }
    }

    /**
     * Check is Human have the glass and it`s not Empty;
     * if true - choose what table will be pour on;
     * and Human`s glasses will be Empty;
     * For fill glass use AbstractHuman method fillGlass().
     */
    private static void pourOnTableWithChoose(AbstractHuman[] arrayOfHumans, List<AbstractTable> listOfTable) {
        Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < arrayOfHumans.length; i++) {
                try {
                if (arrayOfHumans[i].getWithGlass() != null & !arrayOfHumans[i].getWithGlass().isEmpty()) {
                    System.out.println("Choose what table will pour?");
                    System.out.println("from 0 to " + listOfTable.size());
                    int table = scanner.nextInt();
                    if (table >= 0 & table < listOfTable.size()) {
                        arrayOfHumans[i].pourWaterOnTable(listOfTable.get(table));
                        arrayOfHumans[i].getWithGlass().setEmpty(true);
                    } else {
                        System.out.println("You entered more value, than tables is there!");
                    }
                }
        } catch (NullPointerException e) {
                    System.out.println("You don`t have a glass!");
                }
        }
    }
}
