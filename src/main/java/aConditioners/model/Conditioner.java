package aConditioners.model;

/**
 * Entity class with model Conditioner.
 */
public class Conditioner {

    private int temperature;
    private boolean turn = false;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isTurn() {
        return turn;
    }

    public void turnOn() {
        this.turn = true;
    }

    public void turnOff() {
        this.turn = false;
    }

    @Override
    public String toString() {
        return "Conditioner temperature: " + getTemperature() + "\n"
                + "Turn type now is: " + isTurn();
    }
}
