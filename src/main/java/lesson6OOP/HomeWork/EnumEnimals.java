package lesson6OOP.HomeWork;

public enum EnumEnimals {

    BIRD(1),
    DOG(10),
    CAT(4),
    ELEPHANT;

    private int weight;

    EnumEnimals(int weight) {
        this.weight = weight;
    }

    EnumEnimals() {
        weight = 1000;
    }

    public int getWeight() {
        return weight;
    }
}
