package homeTaskFromLists.pack3.model;

/**
 * Tasks from list, page 26 (task 1,2).
 *
 * Task 1: Entity class with constructors, getters, setters and toString().
 * Task 2: Add getCountCars(): int value cars.
 */
public class Car {

    private String number;
    private String color;
    private String model;
    private static int countCars;

    public Car() {
        countCars++;
    }

    public Car(String number) {
        this.number = number;
        countCars++;
    }

    public Car(String number, String color) {
        this.number = number;
        this.color = color;
        countCars++;
    }

    public Car(String number, String color, String model) {
        this.number = number;
        this.color = color;
        this.model = model;
        countCars++;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if ("BMW".equals(model) || "Audi".equals(model) || "VW".equals(model)) {
            this.model = model;
        }
    }

    public static int getCountCars() {
        return countCars;
    }

    @Override
    public String toString() {
        return "Car number: " + getNumber() + "\n"
                + "Color: " + getColor() + "\n"
                + "Model: " + getModel();
    }
}
