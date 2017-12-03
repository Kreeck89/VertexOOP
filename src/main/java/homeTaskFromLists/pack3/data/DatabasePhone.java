package homeTaskFromLists.pack3.data;

import homeTaskFromLists.pack3.model.Phone;

import java.util.LinkedList;
import java.util.List;

/**
 * Tasks from lists, page 29 (Task 3).
 *
 * Base of all Phone.
 */
public class DatabasePhone {

    public static List<Phone> getDataOfPhones() {

        List<Phone> phones = new LinkedList<>();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("(096)548-12-22");
        Phone phone3 = new Phone("(093)333-12-00", "iPhone");
        Phone phone4 = new Phone("(067)111-55-00", "Nokia");
        Phone phone5 = new Phone();
        phone5.setNumber("(050)325-88-99");
        phone5.setMarka("Meizu");
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);
        return phones;
    }
}
