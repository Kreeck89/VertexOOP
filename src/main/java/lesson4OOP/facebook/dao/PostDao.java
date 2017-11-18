package lesson4OOP.facebook.dao;

import lesson4OOP.facebook.model.Post;

import java.util.Date;
import java.util.List;

public interface PostDao {

    List<Post> getAllPost();

    List<Post> getByTitle(String word);
    List<Post> getByDate(Date date);
}
