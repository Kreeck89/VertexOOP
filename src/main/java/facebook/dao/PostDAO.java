package facebook.dao;

import facebook.model.Post;

import java.util.Date;
import java.util.List;

public interface PostDAO extends CradDAO<Post> {

    List<Post> getAllPosts();
    List<Post> getByTitle(String word);
    List<Post> getByDate(Date date);

}
