package facebook.dao;

import facebook.model.Post;

import java.util.Date;
import java.util.List;

public interface PostDAO {

    List<Post> getAllPosts();
    List<Post> getByTitle(String word);
    List<Post> getByDate(Date date);
}
