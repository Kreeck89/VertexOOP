package testingMain;

public class ExtFigure1 extends Figure1 {

    @Override
    public void move() {
        System.out.println("Move Extend Figure 1, not Figure 1");
    }

    public void start() {
        System.out.println("Start Extends Figure 1, not Figure 1");
    }
}
