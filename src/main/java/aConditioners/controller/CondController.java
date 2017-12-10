package aConditioners.controller;

import aConditioners.model.Conditioner;
import aConditioners.service.CondService;
import aConditioners.service.factory.ServiceFactory;

import java.util.List;

/**
 * Tasks from Lists, page 46 (Task3).
 */
public class CondController {

    public static void main(String[] args) {

        CondService allConditionerMethods = ServiceFactory.getAllConditionerMethods();
        List<Conditioner> allConditioner = allConditionerMethods.getAllConditioner();

        allConditionerMethods.printAllConditioners(allConditioner);

        System.out.println(allConditioner.get(1));
        allConditionerMethods.turnOFF(1, allConditioner);
        System.out.println(allConditioner.get(1));


        allConditionerMethods.turnON(1, allConditioner);
        System.out.println(allConditioner.get(1));

        allConditionerMethods.tempIS(1, 5, allConditioner);
        System.out.println(allConditioner.get(1));
    }
}
