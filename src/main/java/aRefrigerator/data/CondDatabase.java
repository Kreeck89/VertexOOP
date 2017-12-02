package aRefrigerator.data;

import aRefrigerator.model.Conditioner;

import java.util.ArrayList;
import java.util.List;

/**
 * NEW Database of conditioners;
 * Remember: If call getAllConditioners() against, you will create NEW Database with the same Conditioners;
 * You must work with Database called in CondController() class!
 */
public class CondDatabase {

    public static List<Conditioner> getAllConditioners() {
        ArrayList<Conditioner> conditionersList = new ArrayList<>();
        Conditioner conditioner1 = new Conditioner();
        Conditioner conditioner2 = new Conditioner();
        Conditioner conditioner3 = new Conditioner();
        Conditioner conditioner4 = new Conditioner();
        Conditioner conditioner5 = new Conditioner();
        Conditioner conditioner6 = new Conditioner();
        Conditioner conditioner7 = new Conditioner();
        Conditioner conditioner8 = new Conditioner();
        Conditioner conditioner9 = new Conditioner();
        Conditioner conditioner10 = new Conditioner();
        conditioner1.setTemperature(3);
        conditioner10.setTemperature(4);
        conditioner3.setTemperature(2);
        conditioner9.setTemperature(1);
        conditioner7.setTemperature(5);
        conditioner1.turnOn();
        conditioner2.turnOn();
        conditioner4.turnOn();
        conditioner5.turnOff();
        conditioner6.turnOn();
        conditionersList.add(conditioner1);
        conditionersList.add(conditioner2);
        conditionersList.add(conditioner3);
        conditionersList.add(conditioner4);
        conditionersList.add(conditioner5);
        conditionersList.add(conditioner6);
        conditionersList.add(conditioner7);
        conditionersList.add(conditioner8);
        conditionersList.add(conditioner9);
        conditionersList.add(conditioner10);
        return conditionersList;
    }
}
