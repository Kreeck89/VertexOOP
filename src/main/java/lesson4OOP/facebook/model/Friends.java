package lesson4OOP.facebook.model;

import java.time.LocalDate;

public class Friends {

    private String name;
    private String city;
    private int age;
    private LocalDate dateOfBorn;
    private long ageInDays;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBorn() {
        return dateOfBorn;
    }

    public void setDateOfBorn(LocalDate dateOfBorn) {
        this.dateOfBorn = dateOfBorn;
    }

    public long getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(long ageInDays) {
        this.ageInDays = ageInDays;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "City: " + getCity() + "\n"
                + "Years age: " + getAge() + "\n"
                + "Days age: " + getAgeInDays() + "\n"
                + "Date of born: " + getDateOfBorn();
    }
}
