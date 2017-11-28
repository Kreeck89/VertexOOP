package homeTaskFromLists.pack4;

public class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public MyInteger() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int pluss(MyInteger integer) {
        int some = integer.getValue() + this.value;
        return some;
    }
}
