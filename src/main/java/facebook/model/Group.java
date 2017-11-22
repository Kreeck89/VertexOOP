package facebook.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Group {

    private String nameGroup;
    private long followers;
    private LocalDate dataOfCreate;

    @Override
    public String toString() {
        return "Name of Group: " + getNameGroup() + "\n"
                + "Followers: " + getFollowers() + "\n"
                + "Data of Created group" + getDataOfCreate();
    }
}
