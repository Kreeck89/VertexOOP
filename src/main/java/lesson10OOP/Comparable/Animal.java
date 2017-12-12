package lesson10OOP.Comparable;

public class Animal {

     String type;
     int weight;

    public Animal(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (weight != animal.weight) return false;
        return type != null ? type.equals(animal.type) : animal.type == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }

}
