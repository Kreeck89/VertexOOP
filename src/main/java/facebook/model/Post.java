package facebook.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post extends AbstractEntity {

    private String title;
    private String description;
    private Date dataPost;
    private long id;

    @Override
    public String toString() {
        return "Title: " + getTitle() + "\n"
                + "Description: " + getDescription() + "\n"
                + "Data of print post: " + getDataPost();
    }
}
