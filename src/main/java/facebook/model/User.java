package facebook.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private String surname;
    private String cityBorn;
    private int age;
    private String maritalStatus;

    public enum MaritalSatusUser {
        DIVERCED,
        ACTIVE_SEARCH,
        SINGLE,
        COMPLEX,
        IN_LOVE
    }

    @Override
    public String toString() {
        return "User`s name is: " + getName() + "\n"
                + "Surname is: " + getSurname() + "\n"
                + "Born in the " + getCityBorn() + "\n"
                + "User`s age is: " + getAge() + "\n"
                + "Marital Status: " + getMaritalStatus();
    }
}

