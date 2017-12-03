package homeTaskFromLists.pack7.service;

import homeTaskFromLists.pack7.modelPhones.IPhone7;
import homeTaskFromLists.pack7.modelPhones.IPhoneX;
import homeTaskFromLists.pack7.modelPhones.Nokia;
import homeTaskFromLists.pack7.modelPhones.Samsung;

/**
 * Tasks from lists, page 51 (Task).
 */
public class PhoneService {

    public static void main(String[] args) {

        Samsung samsung = new Samsung("333-00-99", true, 15);
        Nokia nokia = new Nokia("555-22-11", true, 12);
        IPhone7 iPhone7 = new IPhone7("111-11-11", true, 14, 0221212);
        IPhoneX iPhoneX = new IPhoneX("777-77-77", true, 14, 7779997);

        iPhone7.call(nokia);
        System.out.println(iPhone7.toString());

    }
}
