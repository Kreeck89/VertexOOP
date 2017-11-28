package homeTaskFromLists.pack3.model;

/**
 * Tasks from lists, page 29 (Task 3).
 *
 * Class Entity.
 */
public class Phone {

    private static Phone[] phones = new Phone[10];
    private String number;
    private String marka;

    public Phone(String number, String marka) {
        this.number = number;
        this.marka = marka;
    }

    public Phone(String number) {
        this.number = number;
    }

    public Phone() {
    }

    public static Phone[] getPhones() {
        return phones;
    }

    public static void setPhones(Phone[] phones) {
        Phone.phones = phones;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Phone number is: " + getNumber()
                + "Model of mobile: " + getMarka();
    }
}
