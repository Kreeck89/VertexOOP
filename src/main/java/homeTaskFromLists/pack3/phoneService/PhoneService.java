package homeTaskFromLists.pack3.phoneService;

import homeTaskFromLists.pack3.data.DatabasePhone;
import homeTaskFromLists.pack3.model.Phone;

import java.util.List;
import java.util.Random;

/**
 * Tasks from lists, page 29 (Task 3).
 *
 * isNumberExist(String s) - check number in database;
 * call(String s, Phone p) - Print connect with send number, before checked it in CondDatabase;
 * returnRandomPhone() - return random phone number from CondDatabase.
 */
public class PhoneService {

    public static void main(String[] args) {
        Phone phone1 = DatabasePhone.getDataOfPhones().get(4);
        String num1 = "(096)548-12-22";
        String num2 = "(050)325-88-99";

        System.out.println(isNumberExist(num1));
        call(num2, phone1);
        System.out.println(returnRandomPhone());

    }

    private static boolean isNumberExist(String number) {
        List<Phone> dataOfPhones = DatabasePhone.getDataOfPhones();
        for (Phone elem : dataOfPhones) {
            if (number.equals(elem.getNumber())) {
                return true;
            }
        }
        return false;
    }

    private static void call(String numberCall, Phone phone) {
        List<Phone> dataOfPhones = DatabasePhone.getDataOfPhones();
        for (Phone elem : dataOfPhones) {
            if (numberCall.equals(elem.getNumber())) {
                System.out.println("Call from: " + phone.getNumber() + " model: " + phone.getMarka()
                        + " To: " + elem.getNumber() + " model: " + elem.getMarka());
                return;
            }
        }
                System.out.println("Don`t have this number in database Phone!");
    }

    private static String returnRandomPhone() {
        Random random = new Random();
        List<Phone> dataOfPhones = DatabasePhone.getDataOfPhones();
        int limit = dataOfPhones.size() - 1;
        return dataOfPhones.get(random.nextInt(limit)).getNumber();
    }
}
