package homeTaskFromLists.pack6.models;

public class Square {

    private double sideAA;
    private double sideBB;

    public Square() {
    }

    public Square(double sideAA, double sideBB) {
        this.sideAA = sideAA;
        this.sideBB = sideBB;
    }

    public double getSideAA() {
        return sideAA;
    }

    public void setSideAA(double sideAA) {
        this.sideAA = sideAA;
    }

    public double getSideBB() {
        return sideBB;
    }

    public void setSideBB(double sideBB) {
        this.sideBB = sideBB;
    }

    public double getPerimetr() {
        return getSideAA() * 2 + getSideBB() * 2;
    }

    public double getSquare() {
        return getSideAA() * getSideBB();
    }

}
