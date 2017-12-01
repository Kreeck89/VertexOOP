package homeTaskFromLists.pack6.models;

public class Rectangle extends Square {

    private double sideAA;
    private double sideBB;

    public Rectangle(double sideAA, double sideBB) {
        this.sideAA = sideAA;
        this.sideBB = sideBB;
    }

    @Override
    public double getSideAA() {
        return sideAA;
    }

    @Override
    public void setSideAA(double sideAA) {
        this.sideAA = sideAA;
    }

    @Override
    public double getSideBB() {
        return sideBB;
    }

    @Override
    public void setSideBB(double sideBB) {
        this.sideBB = sideBB;
    }
}
