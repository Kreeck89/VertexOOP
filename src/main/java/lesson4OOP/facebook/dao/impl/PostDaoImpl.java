package lesson4OOP.facebook.dao.impl;

import lesson4OOP.facebook.dao.PostDao;
import lesson4OOP.facebook.data.Database;
import lesson4OOP.facebook.model.Post;

import java.util.List;

public class PostDaoImpl implements PostDao {
    @Override
    public List<Post> getAllPost() {
        return Database.getAllPost();
    }
}
