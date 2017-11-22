package facebook.service;

import facebook.model.Post;

import java.util.Date;
import java.util.List;

public interface PostService {

    List<Post> getAllPosts();
    List<Post> getByTitle(String word);
    List<Post> getByDate(Date date);
}
