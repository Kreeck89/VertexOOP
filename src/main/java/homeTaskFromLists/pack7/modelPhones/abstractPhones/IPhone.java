package homeTaskFromLists.pack7.modelPhones.abstractPhones;

public abstract class IPhone extends Phone {

    private int appleID;

    public IPhone(String number, boolean camera, int sideSize, int appleID) {
        super(number, camera, sideSize);
        this.appleID = appleID;
    }

    public int getAppleID() {
        return appleID;
    }

    public void setAppleID(int appleID) {
        this.appleID = appleID;
    }

    @Override
    public String toString() {
        return super.toString() + "AppleID is: " + getAppleID();
    }
}
