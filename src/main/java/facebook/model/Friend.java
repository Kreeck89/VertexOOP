package facebook.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Friend {

    private String nameFriend;
    private String cityLive;
    private int age;
    private LocalDate dateOfBorn;
    private long ageInDays;

    @Override
    public String toString() {
        return "Name of Friend: " + getNameFriend() + "\n"
                + "City live: " + getCityLive() + "\n"
                + "Friend`s age: " + getAge() + "\n"
                + "Data of Born: " + getDateOfBorn() + "\n"
                + "How many days age: " + getAgeInDays();
    }
}
