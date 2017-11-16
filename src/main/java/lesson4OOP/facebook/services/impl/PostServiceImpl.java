package lesson4OOP.facebook.services.impl;

import lesson4OOP.facebook.dao.PostDao;
import lesson4OOP.facebook.dao.factory.DaoFactory;
import lesson4OOP.facebook.model.Post;
import lesson4OOP.facebook.services.PostService;

import java.util.List;

public class PostServiceImpl implements PostService {
    @Override
    public List<Post> getAllPost() {
        PostDao allPost = DaoFactory.getPostDao();
        return allPost.getAllPost();
    }
}
