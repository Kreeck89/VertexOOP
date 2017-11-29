package homeTaskFromLists.pack2.model;

import homeTaskFromLists.pack5.Track;

public class Car {

    private String number;
    private String color;
    private int countPassenger;
    private CarsState carState;
    private Track track;

    /**
     * Method for print parameters of car.
     */
    public void printAboutMe() {
        System.out.println("Number is: " + getNumber() + "\n"
                + "Color is: " + getColor() + "\n"
                + "Passengers in the car: " + getCountPassenger());
    }

    /**
     * Adds passengers to car and check in range -5 to 5.
     */
    public void addPassenger(int human) {
        if (human >= -5 & human <= 5) {
            setCountPassenger(getCountPassenger() + human);
        }
    }

    /**
     * Starts car if did not start early and don`t move.
     */
    public void startCar() {
        CarsState carsState = getCarState();
        switch (carsState) {
            case START:
                System.out.println("Can`t start, because car is working now");
                break;
            case MOVE:
                System.out.println("Can`t start, because car is moving now");
                break;
            case STOP:
                System.out.println("The car was started.");
                setCarState(CarsState.START);
                break;
            default:
                break;
        }
    }

    /**
     * Starts move car if was started early and don`t moves now.
     */
    public void moveCar() {
        CarsState carsState = getCarState();
        switch (carsState) {
            case START:
                System.out.println("The car moves now. All is OK.");
                setCarState(CarsState.MOVE);
                break;
            case MOVE:
                System.out.println("Car can`t move, because moving now.");
                break;
            case STOP:
                System.out.println("Car can`t move, because did not started before.");
                break;
            default:
                break;
        }
    }

    /**
     * Stop car if it moves now. And it`s engine will off.
     */
    public void stopCar() {
        CarsState carsState = getCarState();
        switch (carsState) {
            case START:
                System.out.println("Can`t stop, because working now and wait when will drive.");
                break;
            case MOVE:
                System.out.println("Car was stop and off.");
                setCarState(CarsState.STOP);
                break;
            case STOP:
                System.out.println("Can`t stop, because did not start early.");
                break;
            default:
                break;
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    public CarsState getCarState() {
        return carState;
    }

    public void setCarState(CarsState carState) {
        this.carState = carState;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public void unSetTrack(Track track) {
        this.track = null;
    }

    public enum CarsState {
        START,
        MOVE,
        STOP
    }
}