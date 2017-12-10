package aConditioners.service.impl;

import aConditioners.dao.factory.DAOFactory;
import aConditioners.model.Conditioner;
import aConditioners.service.CondService;

import java.util.List;

/**
 * This class work with some pattern DAOFactory;
 * More information in {@link DAOFactory} or under this JavaDoc.
 */
public class CondServiceImpl implements CondService {

    /**
     * @return new instance of {@CondDatabase};
     */
    @Override
    public List<Conditioner> getAllConditioner() {
     return DAOFactory.getAllConditionersMethods().getAllConditioner();
    }

    /**
     * Print your sent list with conditioners;
     */
    @Override
    public void printAllConditioners(List<Conditioner> list) {
        DAOFactory.getAllConditionersMethods().printAllConditioners(list);
    }

    /**
     * turn Off you conditioner by index, from your sent list conditioners;
     */
    @Override
    public void turnOFF(int index, List<Conditioner> list) {
        if (index >= 0 & index < list.size()) {
            DAOFactory.getAllConditionersMethods().turnOFF(index, list);
        }
    }

    /**
     * turn On you conditioner by index, from your sent list conditioners;
     */
    @Override
    public void turnON(int index, List<Conditioner> list) {
        if (index >= 0 & index < list.size()) {
            DAOFactory.getAllConditionersMethods().turnON(index,list);
        }
    }

    /**
     * Set temperature for your conditioner by index, from your sent list conditioners;
     */
    @Override
    public void tempIS(int index, int temperature, List<Conditioner> list) {
        if (index >= 0 & index < list.size()) {
            if (temperature >= -10 & temperature <= 10) {
                DAOFactory.getAllConditionersMethods().tempIS(index, temperature, list);
            }
        }
    }
}
