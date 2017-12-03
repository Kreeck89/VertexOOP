package homeTaskFromLists.pack7.modelPhones.abstractPhones;

public abstract class Phone {

    private String number;
    private boolean camera;
    private int sideSize;

    public Phone(String number, boolean camera, int sideSize) {
        this.number = number;
        this.camera = camera;
        this.sideSize = sideSize;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }

    public void call(Phone phone) {
        System.out.println("Phone: " + this.getNumber() + " model is: " + this.getClass().getSimpleName()
                + " Call to: " + phone.getNumber() + " and model is: " + phone.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Model is: " + this.getClass().getSimpleName() + "\n"
                + "Phone number: " + this.getNumber() + "\n"
                + "Side size is: " + this.getSideSize() + "\n";
    }
}
