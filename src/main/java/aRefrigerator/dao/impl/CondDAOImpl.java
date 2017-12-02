package aRefrigerator.dao.impl;

import aRefrigerator.dao.CondDAO;
import aRefrigerator.data.CondDatabase;
import aRefrigerator.model.Conditioner;

import java.util.List;

public class CondDAOImpl implements CondDAO {

    /**
     * @return new instance of {@CondDatabase};
     */
    @Override
    public List<Conditioner> getAllConditioner() {
        return CondDatabase.getAllConditioners();
    }

    /**
     * Print your sent list with conditioners;
     */
    @Override
    public void printAllConditioners(List<Conditioner> list) {
        for (Conditioner elem : list) {
            System.out.println(elem);
        }
    }

    /**
     * turn Off you conditioner by index, from your sent list conditioners;
     */
    @Override
    public void turnOFF(int index, List<Conditioner> list) {
        Conditioner conditioner = list.get(index);
        conditioner.turnOff();
    }

    /**
     * turn On you conditioner by index, from your sent list conditioners;
     */
    @Override
    public void turnON(int index, List<Conditioner> list) {
        Conditioner conditioner = list.get(index);
        conditioner.turnOn();
    }

    /**
     * Set temperature for your conditioner by index, from your sent list conditioners;
     */
    @Override
    public void tempIS(int index, int temperature, List<Conditioner> list) {
        Conditioner conditioner = list.get(index);
        conditioner.setTemperature(temperature);
    }
}
